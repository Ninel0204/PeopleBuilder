package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected  String address;

    public Person(String name,String surname,int age,String address){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.address=address;
    }



    public boolean hasAge() {
        if (age!=0){
            return true;
        }else {
            return false;
        }

    }
    public void happyBirthday() {
        age++;
    }
    public boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }
    public String getAddress(){return this.address;}

    public void setAddress(String address){
        this.address=address;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAge(0).setSurname(this.getSurname()).setAddress(this.getAddress());
    }


    @Override
    public String toString(){
        return "Person{ "+
                " name "+name+'\''+
                " surname "+surname+'\''+
                " age "+age+'\''+
                " address "+address+'}';
    }
    @Override
    public int hashCode() {

        return Objects.hash(name, surname, age, address);
    }
}

