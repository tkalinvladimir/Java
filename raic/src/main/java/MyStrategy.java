import model.*;

public final class MyStrategy implements Strategy {
        @Override
    public void act(Robot me, Rules rules, Game game, Action action) {
            Point3D ball = new Point3D();
            ball.set(game.ball.x, game.ball.z, game.ball.y);

            Point3D ball_v = new Point3D();
            ball_v.set(game.ball.velocity_x, game.ball.velocity_z, game.ball.velocity_y);


            if ( !me.touch ) {
                action.target_velocity_x = 0.0;
                action.target_velocity_z = 0.0;
                action.target_velocity_y = -1*100.0;
                action.jump_speed        = 0.0;
                action.use_nitro         = true;
                return;
            }

            boolean jump = (   Math.sqrt((ball.x-me.x)*(ball.x-me.x) + (ball.y-me.y)*(ball.y-me.y) + (ball.z-me.x)*(ball.z-me.x)) < (2.0 + 1.05)
                    && me.y < ball.y );

            boolean is_attacker = false; // = (game.robots.size() == 2);
            for (Robot robot : game.robots) {
                if (   robot.is_teammate
                        && robot.id != me.id) {
                    if (robot.z < me.z) {
                        is_attacker = true;
                    }
                }
            }

            if (is_attacker) {
                // Стратегия нападающего:
                // Просимулирем примерное положение мяча в следующие 10 секунд, с точностью 0.1 секунда
                for (int i = 0; i < 100; ++i) {
                    double t = i * 0.1;
                    Point3D ball_pos = ball.operatorplus((ball_v.operator_umnozhit(t)));
                    // Если мяч не вылетит за пределы арены
                    // (произойдет столкновение со стеной, которое мы не рассматриваем),
                    // и при этом мяч будет находится ближе к вражеским воротам, чем робот,
                    if (   ball_pos.z > me.z
                            && Math.abs(ball.x) < (rules.arena.width / 2.0)
                            && Math.abs(ball.z) < (rules.arena.depth / 2.0) ) {
                        // Посчитаем, с какой скоростью робот должен бежать,
                        // Чтобы прийти туда же, где будет мяч, в то же самое время
                        Point2D delta_pos = new Point2D(ball_pos.x - me.x, ball_pos.z - me.z);
                        double delta_pos_dist = delta_pos.dist();
                        double need_speed = delta_pos_dist / t;
                        // Если эта скорость лежит в допустимом отрезке
                        if (0.5 * 30.0 < need_speed
                                && need_speed < 30.0 ) {
                            // То это и будет наше текущее действие
                            Point2D target_velocity = new Point2D(delta_pos.normalize(delta_pos_dist).operator_umnozhit(need_speed).x,delta_pos.normalize(delta_pos_dist).operator_umnozhit(need_speed).z);
                            action.target_velocity_x = target_velocity.x;
                            action.target_velocity_z = target_velocity.z;
                            action.target_velocity_y = 0.0;
                            action.jump_speed = jump ? 15.0 : 0.0;
                            action.use_nitro = false;
                            return;
                        }
                    }
                }
            }

            // Стратегия защитника (или атакующего, не нашедшего хорошего момента для удара):
            // Будем стоять посередине наших ворот
            Point2D target_pos = new Point2D(0.0, -(rules.arena.depth / 2.0) + rules.arena.bottom_radius);
            // Причем, если мяч движется в сторону наших ворот
            if (ball_v.z < -1e-5) {
                // Найдем время и место, в котором мяч пересечет линию ворот
                double t = (target_pos.z - ball.z) / ball_v.z;
                double x = ball.x + ball_v.x * t;
                // Если это место - внутри ворот
                if (Math.abs(x) < (rules.arena.goal_width / 2.0)) {
                    // То пойдем защищать его
                    target_pos.x = x;
                }
            }

            Point2D target_velocity = new Point2D(target_pos.x - me.x, target_pos.z - me.z);
            target_velocity.operator_umnozhitravno(30.0);

            action.target_velocity_x = target_velocity.x;
            action.target_velocity_z = target_velocity.z;
            action.target_velocity_y = 0.0;
            action.jump_speed = jump ? 15.0 : 0.0;
            action.use_nitro = false;


    }

    @Override
    public String customRendering() {
        return "";
    }

    class Point2D {
        double x = 0.0;
        double z = 0.0;
        Point2D() {}
        Point2D(double x, double z) {
            this.x = x;
            this.z = z;
        }
    void set(double x_, double z_) {
        x = x_; z = z_;
    }
    double dist() {
        return Math.sqrt(x*x + z*z);
    }
    Point2D normalize(double len) {
        return  new Point2D(x/len, z/len);
    }

    double distTo(double x_, double z_) { return Math.sqrt((x-x_)*(x-x_) + (z-z_)*(z-z_)); }
    double distTo(Point2D p) { return distTo(p.x, p.z); }
    Point2D operator_plus(Point2D p) { return new Point2D(x+p.x, z+p.z); }
    Point2D operator_umnozhit(double val) { return new Point2D(x*val, z*val); }
    void operator_umnozhitravno(double val) { x *= val; z *= val; }
}

    class Point3D extends Point2D{
        double y = 0.0; // высота
        Point3D() {}
        Point3D(double x, double z, double y) {
            super(x, z);
        }
        void set(double x_, double z_, double y_) { x = x_; z = z_; y = y_; }
        double dist() { return Math.sqrt(x*x + y*y + z*z); }
        double distTo(double x_, double z_, double y_) { return Math.sqrt((x-x_)*(x-x_) + (y-y_)*(y-y_) + (z-z_)*(z-z_)); }
        double distTo(Point3D p) { return distTo(p.x, p.z, p.y); }
        Point3D operatorplus(Point3D p) { return new Point3D(x+p.x, z+p.z, y+p.y);}
        Point3D operator_umnozhit(double val) { return new Point3D(x*val, z*val, y*val); }
        void operator_umnozhitravno(double val) { x *= val; z *= val; y *= val; }
    }
}
