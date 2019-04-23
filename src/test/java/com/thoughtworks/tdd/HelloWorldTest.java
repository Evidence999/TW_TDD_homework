package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void given_multipleOfThree_return_Fizz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 3);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("Fizz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfFive_return_Buzz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 5);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("Buzz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfSeven_return_Whizz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 7);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("Fizz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfFifteen_return_FizzBuzz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 15);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfTwentyOne_return_FizzWhizz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 21);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("FizzWhizz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfThirtyFive_return_BuzzWhizz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 35);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    @DisplayName("try display name")
    public void given_multipleOfOneHundredAndFive_return_FizzBuzzWhizz() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency, 105);
        //when
        String actual = helloWorld.beenCalled();
        //then
        assertThat(actual, is("FizzBuzzWhizz"));
    }

    //@Test
    //public void should_be_mocked() {
    //     //given
    //     Dependency dependency = mock(dependency.class);
    //     when(dependency.say()).thenReturn("Hello World");
    //     HelloWorld helloWorld = new HelloWorld(dependency);

        //when
    //    String actual = helloWorld.beenCalled();

        //then
    //    assertThat(actual, is("Hello World"));
    //}
}
