# zadanie-eksternistyczne

## Pracownia Projektowa - zaliczenie eksternistyczne

### 1. Co jest celem projektu

*Celem projektu jest przygotowanie prostego narzędzia do raportowania czasu pracy spędzonego w projektach przez pracowników danego zespołu.
Dane wejściowe zawierają zarejestrowane godziny, które znajdują się w plikach o rozszerzeniu .xls
Program generuje raporty, które są wyświetlane w konsoli. Mogą być także eksportowane do pliku exel.*

### 2. Uruchomianie aplikacji

####+ Uruchomienie przez GUI

Należy otworzyć GUI, wczytać główny folder z plikami, a następnie zbudować projekt i uruchomić aplikację "App.jar"
Następnie należy wykonywać polecenia z konsoli **target/classes/2012**

####+ Uruchomienie przez wiersz poleceń

Aby uruchomić aplikację należy wpisać:
> C:\Java\jdk-17.0.1\bin\java.exe -Dfile.encoding=UTF-8 -jar "ścieżka do aplikacji na dysku\App\App.jar"

Następnie należy wpisać ścieżkę do pliku, w którym znajdują się dane w celu wygenerowania raportu.

### 3. Interfejs programu

Po wczytaniu danych program wyświetla ilość podczytanych plików np.: 
> Found 3 excel files

Następnie plik wczytuje trzy tabele danych:
1. ranking pracownikow wg przepracowanych godzin we wszystkich projektach
2. ranking miesięcy wg przepracowanych godzin we wszystkich projektach przez wszystkich pracowników.
3. ranking 10-ciu najbardziej pracowitych dni wg przepracowanych godzin we wszystkich projektach przez wszystkich pracowników.
