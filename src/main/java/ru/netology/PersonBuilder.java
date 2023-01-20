package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= -100) {
            this.age = age;
            return this;
        }
        throw new IllegalArgumentException("Введен некорректный возраст");
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name != null || surname != null || age >= -100 || address != null) {
            return new Person(name,surname,age,address);
        }
        throw new IllegalStateException("Недостаточно данных");
    }
}

