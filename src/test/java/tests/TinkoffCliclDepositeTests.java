package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TinkoffCliclDepositeTests {


    @Test
    @Description("Домашнее задание к уроку №2")
    void clickTinkoffDeposit() {

        open("https://www.tinkoff.ru/");
        $$(byText("Вклады")).find(visible).parent().click();
    }


    }