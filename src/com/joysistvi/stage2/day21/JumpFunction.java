package com.joysistvi.stage2.day21;

public class JumpFunction {


    void jump(double height) {
        System.out.println("Jumping " + height + "meters high!");
    }

    void jump(int noOfJump) {
        System.out.println("Jump " + noOfJump + "x");
    }

    void jump(String animation) {
        System.out.println("Performing jump animation: " + animation);
    }

    void jump(int noOfJump, double height) {
        System.out.println("Jump " + noOfJump + " times at " + height + " meters!");
    }

    void jump(String animation, int speed, double height) {
        System.out.println("Performing " + animation + " at speed " + speed + " while jumping " + height + " meters high!");
    }





    public static void main(String[] args) {
        JumpFunction jumpTest = new JumpFunction();
        jumpTest.jump(3);
        jumpTest.jump(2.5f);
        jumpTest.jump("Backflip");
        jumpTest.jump(5,1.2);
        jumpTest.jump("Twist", 8, 1.5);
    }
}

// Compile-Time Polymorphism -> Method Overloading
// Runtime Polymorphism -> Method Overriding


// int long float double Integer Long Float Double