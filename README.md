# firmaDelegacja - Spring Boot Application

firmaDelegacja is a simple Spring Boot application that demonstrates basic CRUD (Create, Read)
operations using Spring Data JPA
and Thymeleaf for web templates. It also integrates with a PostgreSQL database.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or higher
- Maven 3.0+ (for building and managing dependencies)
- PostgreSQL (for database storage)

## Getting Started

1. Clone repository from GitHub-a:

   ```bash
   git clone https://github.com/kfryGIT/firmaDelegacja.git

2. Go to the project file (Przejdź do katalogu projektu):
   ```bash
      cd firmaDelegacja

3.Build the project using Maven (Zbuduj projekt za pomocą Maven):

    ```bash
    mvn clean install


4.Configure the PostgreSQL database by updating the application.properties file as needed
-change login, password, DB name.
(Skonfiguruj bazę danych PostgreSQL, aktualizując application.properties plik zgodnie z potrzebami
-zmień login, haslo, nazweBD).

5.Run the application (Uruchom aplikację):

    ```bash
    mvn spring-boot:run

6. The application will be available at http://localhost:8080
   (Aplikacja będzie dostępna pod adresem http://localhost:8080)

7.Sign in:

a)administrator
Email: admin@wp.pl  Password: haslo1

b)employee- 
Email: it1@wp.pl  Password: haslo2

## Project structure (Struktura projektu):

src/main/java: Contains Java source code (Zawiera kod źródłowy Java).

src/main/resources: Contains application properties and Thymeleaf templates.(Zawiera właściwości aplikacji i szablony Thymeleaf.)

src/test: Contains tests (Zawiera przypadki testowe).

pom.xml: Maven project configuration file (Plik konfiguracyjny projektu Maven).

##using the app:

-the employee can log in and enter data into the form, then the company will give him
compensation for travel costs
-the application firmaDelegacja calculates all travel costs
-the application shows all completed forms
-the administrator can log in and can see completed forms
-in the future, the administrator will be able to change the rate per km, travel cost limitetc.

(przy użyciu aplikacji:
pracownik może zalogować się i wypełnić wniosek w celu zwrotu kosztów delegacji,
aplikacja oblicza między innymi łączną kwotę zwrotu kosztów delegacji,
aplikacja wyświetla wszystkie wnioski złożone przez pracowników w danej firmie
administrator może zalogować się i wyświetlić wnioski złożone przez pracowników w danej firmie
w przyszłości administrator będzie miał możliwość zmienić stawkę diety, stawkę za km itd.
bowiem aplikację można rozbudować)


## Thanks (Podziękowanie)
Intellij idea, PostgreSQL, Spring Framework, MAVEN 