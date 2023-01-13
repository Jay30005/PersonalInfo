package com.company;

public class Main {

    public static void main(String[] args) {

        Person Me = new Person();
        Me.name= "Jarett Metzgen";
        Me.address= "630 Lavender Street";
        Me.age=23;
        Me.PhoneNumber= 625-9578;
        System.out.println();


        Person Friend = new Person();
        Friend.name= "Brianna Joseph";
        Friend.address= "Lake Independence";
        Friend.age=22;
        Friend.PhoneNumber= 600-1234;



        Person Cousin = new Person();
        Cousin.name= "Keeden Armstrong";
        Cousin.address= "103 NewSite, Sandhill";
        Cousin.age=25;
        Cousin.PhoneNumber= 614-6789;

        System.out.println(Me.name);
        System.out.println(Me.address);
        System.out.println(Me.age);
        System.out.println(Me.PhoneNumber);
        System.out.println();
        System.out.println();

        System.out.println(Friend.name);
        System.out.println(Friend.address);
        System.out.println(Friend.age);
        System.out.println(Friend.PhoneNumber);
        System.out.println();
        System.out.println();

        System.out.println(Cousin.name);
        System.out.println(Cousin.address);
        System.out.println(Cousin.age);
        System.out.println(Cousin.PhoneNumber);




        }
    }
