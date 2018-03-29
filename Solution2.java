

/*
Собираем файл

Собираем файл

Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.

Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, byte[]> map = new TreeMap<>();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (!(fileName = rd.readLine()).equals("end")) {
            FileInputStream fi = new FileInputStream(fileName);
            byte[] buff = new byte[fi.available()];
            fi.read(buff);
            fi.close();

            map.put(fileName, buff);
        }

        FileOutputStream fo = new FileOutputStream(map.firstKey().substring(0, map.firstKey().lastIndexOf('.')));
        for (Map.Entry<String, byte[]> en : map.entrySet()) {
            fo.write(en.getValue());
        }

        rd.close();
        fo.close();
    }
}
