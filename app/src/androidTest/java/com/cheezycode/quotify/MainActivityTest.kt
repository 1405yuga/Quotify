package com.cheezycode.quotify

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule //rule will be implemented before every test cases - arrange
    val actvityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testNextButton() {
        //act
        onView(withId(R.id.btnNext)).perform(click())
        onView(withId(R.id.btnNext)).perform(click())
        onView(withId(R.id.btnNext)).perform(click())

        //assert
        onView(withId(R.id.quoteAuthor)).check(matches(withText("Johann Wolfgang von Goethe")))
    }

}