[![Prog.kiev.ua](logo.png)](https://prog.kiev.ua)

<h3>Java OOP, Homework</h3>

[**<- Java Start**](https://github.com/YuriiSalimov/Prog.kiev.ua-JavaStart)
|
[**Java PRO ->**](https://github.com/YuriiSalimov/Prog.kiev.ua-JavaPRO)

<ol>
<li><strong>Основы ООП</strong>
    <ul>
        <li> 1.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson01/task01">
                Написать класс Circle (круг) по аналогии с Rectangle и метод, который будет возвращать его площадь.
            </a>
        </li>
        <li> 1.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson01/task02">
                Написать класс, который умеет считать количество созданных объектов этого класса (static).
            </a>
        </li>
        <li> 1.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson01/task03">
                Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.
            </a>
        </li>
    </ul>
</li>

<li><strong>Наследование</strong>
    <ul>
        <li> 2.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson02/task01">
                Проект "Cars": добавить свойство «объем двигателя» в класс Engine. Написать код для вывода потраченного топлива на экран.
            </a>
        </li>
        <li> 2.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson02/task02">
                Проект "Students": сделать поиск по фамилии, сделать поиск по дате рождения, сделать ф-ю удаления студента из списка, предусмотреть выход за пределы списка.
            </a>
        </li>
        <li> 2.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson02/task03_04_06">
                Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки SMS, который будет дописывать к сообщению слово "Hello".
            </a>
        </li>
        <li> 2.4.
            <a href="/src/main/java/com/yurii/salimov/lesson02/task03_04_06">
                Модифицировать класс Phone так, чтобы он ситал количество звонков и сообщений отдельно для каждого объекта.
            </a>
        </li>
        <li> 2.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson02/task05">
                Написать иерархию классов «Фигуры». Фигура → Треугольник → Прямоугольник → Круг. Реализовать ф-ю подсчета площади для каждого типа фигуры.
            </a>
        </li>
        <li> 2.6. 
            <a href="/src/main/java/com/yurii/salimov/lesson02/task03_04_06">
                Написать код для связи телефонов между собой. У каждого телефона будет свой номер. При вызове call(x) телефон должен найти собеседника по номеру x из всех доступных в данный момент телефонов) из всех созданных объектов типа Phone) и вызвать его метод answer().
            </a>
        </li>
    </ul>
</li>

<li><strong>Полиморфизм. Исключения</strong>
    <ul>
        <li> 3.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task01_02_03">
                Написать своего наследника Developer. Добавить его в существующий проект.
            </a>
        </li>
        <li> 3.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task01_02_03">
                Создать список разработчиков и заполнить его случайным образом. Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.
            </a>
        </li>
        <li> 3.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task01_02_03">
                Написать код, который разделит список объектов Developer на 3 отдельных списка для Juniors, Seniors и Team Leads. Вывести списки на экран.
            </a>
        </li>
        <li> 3.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task04">
                Написать программу, которая будет рисовать на консоли прямоугольник с заданными длинами сторон.
            </a>
        </li>
        <li> 3.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task05">
                Построить иерархию классов «Фигуры» с учетом знаний о полиморфизме. У каждого класса фигуры должен бать метод подсчета площади. Создать список фигур. Вывести площади всех фигур на экран.
            </a>
        </li>
        <li> 3.6. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task06">
                Написать метод разбора списка параметров в формате URL: param1=value1&param2=value2&param3=value3. В случае ошибки в формате бросать исключение.
            </a>
        </li>
        <li> 3.7. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task07">
                Найти в стандартной библиотеке 5 классов, методы которых кидают исключения и написать пример кода для их обработки (пример: Integer.parseInt).
            </a>
        </li>
        <li> 3.8. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task08">
                Написать аналог Integer.parseInt. Использовать исключения.
            </a>
        </li>
        <li> 3.9. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task09">
                Придумать свое исключение и написать соответствующий класс и использующий его код.
            </a>
        </li>
        <li> 3.10. 
            <a href="/src/main/java/com/yurii/salimov/lesson03/task10">
                * Модифицировать проект «Список студентов» так, чтобы 1) список вводился с клавиатуры, 2) была возможность удалять студента по номеру, 3) при введении неправильных даннях (пустое имя, неправильная дата) программа кидала исключение и обрабатывала его с выводом соотв. сообщений на экран.
            </a>
        </li>
    </ul>
</li>

<li><strong>Интерфейсы</strong>
    <ul>
        <li> 4.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson04/task01">
                Модифицировать код для сортировки Human чтобы элементы упорядочивались по убыванию.
            </a>
        </li>
        <li> 4.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson04/task02">
                Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры.
            </a>
        </li>
        <li> 4.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson04/task03_04_05">
                Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
            </a>
        </li>
        <li> 4.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson04/task03_04_05">
                Добавить в проект ф-ю мониторинга более одного файла.
            </a>
        </li>
        <li> 4.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson04/task03_04_05">
                Написать код для мониторинга каталога. Выводить на экран предупреждение если в каталог добавляется текстовый файл (*.txt).
            </a>
        </li>
    </ul>
</li>

<li><strong>Потоки ввода-вывода</strong>
    <ul>
        <li> 5.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task01">
                Модифицировать проект FindFiles так, чтобы программа искала в каталоге все файлы с расширениями из списка.
            </a>
        </li>
        <li> 5.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task02">
                Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов, имя которых длиннее 5 символов и вторая буква равна "A".
            </a>
        </li>
        <li> 5.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task03">
                Написать программу, которая считает текстовый файл, заменит в нем все слова "Hello" на "1234" и запишет изменения в тот-же файл.
            </a>
        </li>
        <li> 5.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task04_05">
                Написать программу для копирования всех файлов из одного каталога в другой.</li>
        <li> 5.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task04_05">
                Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
            </a>
        </li>
        <li> 5.6. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task06">
                Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream. Подумать как улучшить программу №3 с помощью этих классов.
            </a>
        </li>
        <li> 5.7. 
            <a href="/src/main/java/com/yurii/salimov/lesson05/task07">
                Написать программу, которая скопирует несколько файлов в один. Подумать как для этого использовать java.io.SequenceInputStream.
            </a>
        </li>
    </ul>
</li>

<li><strong>Многопоточное программирование</strong>
    <ul>
        <li> 6.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task01">
                Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона.
            </a>
        </li>
        <li> 6.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task02">
                Создать поток, который будет каждые 10 секунд выводить текущее время на экран. Сделать возможность прерывания потока с помощью команды с консоли.
            </a>
        </li>
        <li> 6.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task03">
                Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
            </a>
        </li>
        <li> 6.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task04">
                Создать поток, который создаст 50 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут. Прерывание дочерних потоков должно выполнятся из потока их порождающего.
            </a>
        </li>
        <li> 6.5.* 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task05">
                Копирование файла блоками (1 поток на блок).
            </a>
        </li>
        <li> 6.6. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task06">
                Написать программу копирования файла с выводом прогресса в % на консоль.
            </a>
        </li>
        <li> 6.7. 
            <a href="/src/main/java/com/yurii/salimov/lesson06/task07">
                Разобраться с методом fact (рекурсия).
            </a>
        </li>
    </ul>
</li>

<li><strong>Синхронизация потоков</strong>
    <ul>
        <li> 7.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson07/task01">
                Написать класс, который позволит записывать текстовые данные в один файл из разных потоков.
            </a>
        </li>
        <li> 7.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson07/task02">
                Решить задачу про банк с помощью чего-нибудь из java.util.concurrent.* Не через Atomic.
            </a>
        </li>
        <li> 7.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson07/task03">
                Реализовать многопоточное перемножение квадратных матриц. Сравнить скорость выполнения алгоритма с однопоточным решением.
            </a>
        </li>
    </ul>
</li>

<li><strong>Generics. Executor. Коллекции</strong>
    <ul>
        <li> 8.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson08/task01">
                Написать метод для конвертации массива строк/чисел в список.
            </a>
        </li>
        <li> 8.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson08/task02">
                Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а затем выведет результат на экран.
            </a>
        </li>
        <li> 8.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson08/task03">
                Написать класс, который умеет хранить в себе масив любых типов данных (int, long etc.). Реализовать метод, который возвращает любой элемент массива по индексу.
            </a>
        </li>
        <li> 8.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson08/task04">
                Написать монитор, который хранит дату модификации файлов и выводит сообщения при изменении в файлах*.
            </a>
        </li>
        <li> 8.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson08/task05">
                Написать свою реализацию классов ArrayList и LinkedList.
            </a>
        </li>
    </ul>
</li>

<li><strong>Object</strong>
    <ul>
        <li> 9.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson09/task01_02_03">
                Написать класс «человек». Реализовать его методы clone, equals, hashCode, toString.
            </a>
        </li>
        <li> 9.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson09/task001_02_03">
                Реализовать возможность сериализации для класса «человек».
            </a>
        </li>
        <li> 9.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson09/task01_02_03">
                Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем старте прочитает записи и выведет сохраненные данные на экран. Одинаковые записи должны игнорироваться (Set + equals*).
            </a>
        </li>
        <li> 9.4.* 
            <a href="/src/main/java/com/yurii/salimov/lesson09/task04">
                Написать проект «Виртуальная файловая система». Каждый каталог и файл представлен одним объектом (Directory/File); должны поддерживатся связи между объектами; вся файловая структура хранится в одном файле. Обеспечить базовые ф-и для работы с ФС: добавление и удаление файлов и каталогов etc.
            </a>
        </li>
    </ul>

<li><strong>HashMap</strong>
    <ul>
        <li> 10.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson10/task01_02">
                Написать программу переводчик, которая будет переводить текст, написанный на одном языке, на другой язык согласно заранее составленному словарю.
            </a>
        </li>
        <li> 10.2.*
            <a href="/src/main/java/com/yurii/salimov/lesson10/task01_02">
                Сделать ф-ю ручного наполнения словаря и возможность его сохранения на диск.
            </a>
        </li>
        <li> 10.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson10/task03_04">
                Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
            </a>
        </li>
        <li> 10.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson10/task03_04">
                Пользователь вводит набор чисел в виде одной строки ("1, 2, 3, 4, 4, 5"). Избавиться от повторяющихся элементов в строке и вывести результат на экран.
            </a>
        </li>
        <li> 10.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson10/task05">
                Написать программу «База данных пользователей» с функциями добавления, удаления, поиска и вывода информации о пользователе по номеру.
            </a>
        </li>
        <li> 10.6. 
            <a href="/src/main/java/com/yurii/salimov/lesson10/task06">
                Реализовать методы HashMap: keySet, entrySet, containsValue etc.
            </a>
        </li>
    </ul>
</li>

<li><strong>Сетевое программирование</strong>
    <ul>
        <li> 11.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson11/task01">
                Вывести на экран все ссылки, которые содержатся в скачанном HTML документе.
            </a>
        </li>
        <li> 11.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson11/task02">
                Скачать все HTML файлы, доступные по ссылкам в отдельный каталог.
            </a>
        </li>
        <li> 11.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson11/task03">
                Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.
            </a>
        </li>
    </ul>
</li>

<li><strong>Сетевое программирование. Чат</strong>
    <ul>
        <li> 12.1. 
            <a href="/src/main/java/com/yurii/salimov/lesson12/task01">
                В файле хранится список веб-серверов. Надо проверить какие из серверов доступны в данный момент и создать отчет в формате сервер=статус.
            </a>
        </li>
        <li> 12.2. 
            <a href="/src/main/java/com/yurii/salimov/lesson12/task02">
                Написать программу для стресс-тестирования веб-серверов.
            </a>
        </li>
        <li> 12.3. 
            <a href="/src/main/java/com/yurii/salimov/lesson12/task03">
                Написать стресс-тест для чата.
            </a>
        </li>
        <li> 12.4. 
            <a href="/src/main/java/com/yurii/salimov/lesson12/task04">
                Сделать ф-ю приватных сообщений.
            </a>
        </li>
        <li> 12.5. 
            <a href="/src/main/java/com/yurii/salimov/lesson12/task04">
                Реализовать передачу файлов между клиентами.
            </a>
        </li>
    </ul>
</li>
</ol>

[**<- Java Start**](https://github.com/YuriiSalimov/Prog.kiev.ua-JavaStart)
|
[**Java PRO ->**](https://github.com/YuriiSalimov/Prog.kiev.ua-JavaPRO)

[_**Yurii Salimov**_](https://www.linkedin.com/in/yurii-salimov)
([yuriy.alex.salimov@gmail.com](mailto:yuriy.alex.salimov@gmail.com))
