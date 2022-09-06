# Проект по автоматизации тестирования веб-приложения Wildberries
## <a target="_blank" href="https://www.wildberries.ru/">Wildberries - Интернет-магазин модной одежды и обуви!</a>
<p align="center">
<img title="logo" src="images/wb_screen/7d525e472aaac570bb3b45efe6f307c1.jpg">
</p>


## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

***

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

***

## :notebook_with_decorative_cover: Реализованные проверки
- При авторизации с пустым значением в поле номера телефона - отображается ошибка валидации
- Отображается экран ввода кода подтверждения, при авторизации с валидным номером телефона
- При неверно введенном коде подтверждения - отображается ошибка, авторизация является неудачной
- При добавлении товара в список избранных неавторизованному пользователю отображается страница Авторизации и создания аккаунта
- Количество добавленных товаров отображается в Корзине, в хэдере страницы
- При клике на ссылку 'Согласен с условиями Правил пользования торговой площадкой', открывается страница с правилами

***

## :electric_plug: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/swastest-project/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/wb_screen/jenkins_main.png">
</p>  

***

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test -Dhost=local 
```
## :gear: Запуск тестов с выбором параметров
<img title="Jenkins ParamStart" src="images/wb_screen/jenkins_build.png">

Удаленный запуск:
```
clean
test
-Dhost=remote
-DbrowserName=${BROWSERNAME}
-DbrowserVersion=${VERSION}
-DenvUrl=${ENV_URL}
-DbrowserSize=${BROWSERSIZE}
```


***

## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/wb_screen/allure_main.png">
</p>

- ### Страница с проведенными тестами
*Можно подробно разобрать каждый шаг тест кейса, сбоку отображаются все шаги и тестовые данные*
<p align="center">
<img title="Allure Test Page" src="images/wb_screen/TC_allure.png">
</p>

***

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/wb_screen/tgt_1.png">
</p>

***
## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/wb_screen/652829b7999b22636e89855b0ca8e52c.gif">
</p>

