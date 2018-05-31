import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
class Cat
{
    public String name;
    public int age;
    public int weight;
    Cat(){}

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
