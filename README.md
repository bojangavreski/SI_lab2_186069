# Втора лабораториска вежба по Софтверско инженерство

## Бојан Гаврески, бр. на индекс 186069

### Група на код:
Ја добив групата на код 2

### Control Flow Graph

![](https://raw.githubusercontent.com/bojangavreski/SI_lab2_186069/master/si_lab_graph.png)


### Цикломатска комплексност

Цикломатската комплексност на овој код е 8.
Ја добив со користење на формулата CC=E-N+2
Каде бројот на јазли N=20, бројот на ребра E=26

### Тест случаи според критериумот Every statement
    void everyBranchAndStatementTest(){
    RuntimeException ex;

    ex= assertThrows(RuntimeException.class, ()->SILab2.function(null,createList("Bojan")) );
    assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

    User user1=new User(null,"vafla","bojan@live.com");
    ex= assertThrows(RuntimeException.class, ()->SILab2.function(user1,createList("Bojan,Riste,Marko")) );
    assertTrue(ex.getMessage().contains("User already exists!"));

    User user2=new User("Dimitar","@ssL@", null);
    assertTrue(user2.getEmail()==null);

    User user3=new User("Krste","badpassword2020","RandomString");
    assertTrue(!user3.getEmail().contains("@") || !user3.getEmail().contains("."));

    User user4=new User("Krste","badpassword2020","bojan.gavreski@students.finki.ukim.mk");
    assertTrue(user4.getEmail().contains("@") && user4.getEmail().contains("."));}




### Тест случаи според критериумот Every branch

    void everyBranchAndStatementTest(){
    RuntimeException ex;

    ex= assertThrows(RuntimeException.class, ()->SILab2.function(null,createList("Bojan")) );
    assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

    User user1=new User(null,"vafla","bojan@live.com");
    ex= assertThrows(RuntimeException.class, ()->SILab2.function(user1,createList("Bojan,Riste,Marko")) );
    assertTrue(ex.getMessage().contains("User already exists!"));

    User user2=new User("Dimitar","@ssL@", null);
    assertTrue(user2.getEmail()==null);

    User user3=new User("Krste","badpassword2020","RandomString");
    assertTrue(!user3.getEmail().contains("@") || !user3.getEmail().contains("."));

    User user4=new User("Krste","badpassword2020","bojan.gavreski@students.finki.ukim.mk");
    assertTrue(user4.getEmail().contains("@") && user4.getEmail().contains("."));}


### Објаснување на напишаните unit tests

Тестовите за every branch ги исполнуваат условите и за every statement.
Во тестовите ги имам сите можни исходи на кодот, односно:
* Null User 
* Веќе постоечки корисник
* Невалидна е-маил адреса
* Исполнати сите услови


