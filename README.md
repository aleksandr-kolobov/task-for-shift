# task-for-shift
При запуске утилиты в командной строке подается несколько файлов (лежат в папке \data),
содержащих вперемешку целые числа, строки и числа с "плавающей точкой".
В качестве разделителя используется перевод строки.
Строки из файлов читаются по очереди в соответствии с их перечислением в командной строке.
Задача утилиты записать разные типы данных в разные файлы. Целые числа в один выходной файл,
числа с "плавающей точкой" в другой, строки в третий.

Инструкция по запуску:

Распаковать архив, в котором упакован проект созданный
в среде IntelliJ IDEA (версия Java 17)

Можно открыть проект в среде и запустить через командную строку
Так же можно запустить из любой другой командной строки посредством java-машины
с указанием имени(и пути) jar файла и параметров...
Наклон слеша указан для ОС Windows...

Примеры запуска:
java -jar out\SortData.jar -o \data -p result_ -s data\in1.txt data\in2.txt data\in3.txt data\in4.txt
java -jar out\SortData.jar -s -o \data\res -a -p sample- data\in1.txt data\in2.txt data\in3.txt

Параметры программы задаются при запуске через аргументы командной строки:
-o задает путь для результатов
-p задает префикс имен выходных файлов
Например -o \path -p res_ задают вывод в файлы \path\res_integers.txt, \path\res_strings.txt и тд.
-a задает режим добавления в существующие файлы
Выбор статистики производится опциями -s (короткая) и -f (длинная)
Остальные параметры – имена входных файлов, не менее одного.

Краткая статистика содержит только количество элементов записанных в исходящие файлы.
Полная статистика для чисел дополнительно содержит минимальное и максимальное значения, сумма и среднее.
Полная статистика для строк, помимо их количества, содержит также размер самой короткой строки и самой длинной.

По умолчанию файлы с результатами располагаются в текущей папке.
По умолчанию файлы с результатами перезаписывается.

