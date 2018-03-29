
/*
Прайсы
*/
/*
 Прайсы 2

CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD

Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id

Значения параметров:
где id - 8 символов
productName - название товара, 30 символов
price - цена, 8 символов
quantity - количество, 4 символа
-u - обновляет данные товара с заданным id
-d - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19847   Шорты пляжные синие           159.00  12
198479  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

Требования:
1. Программа должна считать имя файла для операций CrUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
5. Созданные для файлов потоки должны быть закрыты.

 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    private static String productName;
    private static String price;
    private static int quantity;

    public static void main(String[] args) throws Exception {
        if (args.length> 0 && (args[0].equals("-u")||args[0].equals("-d"))) {
            String res = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int id = Integer.parseInt((args[1].length()<=8)?args[1]:args[1].substring(0,8));
            if (args[0].equals("-u")) {
                productName = (args[2].length() <= 30) ? args[2] : args[2].substring(0, 30);
                price = String.format("%.2f",Float.parseFloat((args[3].length() <= 8) ? args[3] : args[3].substring(0, 7)));
                quantity = Integer.parseInt((args[4].length() <= 4) ? args[4] : args[4].substring(0, 4));
            }
            String fileName = reader.readLine();
            reader.close();
            FileInputStream streamRead = new FileInputStream(fileName);
            reader = new BufferedReader(new InputStreamReader(streamRead));
            String str;
            while ((str = reader.readLine()) != null) {
                int currID = Integer.parseInt(str.substring(0,8).replace(" ",""));
                if (id == currID) {
                    if (args[0].equals("-u")) {
                        res += "\n" + String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
                    }
                    else if (args[0].equals("-d")){
                        res += "";
                    }
                }
                else {
                    res = res+(res.length()==0?"":"\n")+str;
                }
            }
            reader.close();
            FileOutputStream streamWrite = new FileOutputStream(fileName);
            streamWrite.write(res.getBytes());
            streamWrite.close();
        }
    }
}
