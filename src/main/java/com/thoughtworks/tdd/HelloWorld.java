package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {
    private Dependency dependency;
    private int studentId;

    public HelloWorld(Dependency dependency, int studentId) {
        this.dependency = dependency;
        this.studentId = studentId;
    }
    public String beenCalled() {
        String result = "";
        if (this.studentId%3 == 0) {
            result = result + dependency.sayFizz();
        }
        if (this.studentId%5 == 0) {
            result = result + dependency.sayBuzz();
        }
        if (this.studentId%7 == 0) {
            result = result + dependency.sayWhizz();
        }
        return result;
    }
}
