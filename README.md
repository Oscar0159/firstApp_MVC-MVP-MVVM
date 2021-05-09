# firstApp
#### A simple app, to illustrate the use of MVC, MVP, and MVVM designer patterns to organize the application.

The main branch contains just the model.

Other branches contain the model, plus a User Interface following
- mvc - Example of Model View Controller
- mvp - Example of Model View Presenter
- mvvm - Example of Model View ViewModel with Databinding

## MVC Model View Controller
Model: The classes containing data structure and logics
View: The xml layout files
Controller: The Activity class, all the logics between the user and the application are happening here.

## MVP Model View Presenter
Model: Same as in MVC pattern
View: The xml layout files and the Activity or Fragment classes
Presenter: The presenter class and interface, all the logics from the controller in MVC pattern are now transferred to the presenter

## MVVM Model View ViewModel
Model: Same as in MVC and MVP pattern
View: The xml layout files and the Activity or Fragment classes, the layout files are bind to the viewmodel through data binding, the data in the layout will be updated through observables.
ViewModel: The viewmodel class and interface, it is similar to presenter in MVP pattern, but instead of talking to the View directly by holding a reference of the view, it is now through data binding and observer pattern.

## References
[MVC, MVP and MVVM design pattern examples in Android using Kotlin](https://github.com/pengcy/mvc-mvp-mvvm/tree/master "MVC, MVP and MVVM design pattern examples in Android using Kotlin")

[MVC, MVP and MVVM design pattern examples in Android using Java](https://github.com/ericmaxwell2003/ticTacToe "MVC, MVP and MVVM design pattern examples in Android using Java")

[What is difference between MVC, MVP & MVVM design pattern in terms of coding c#](https://stackoverflow.com/questions/19444431/what-is-difference-between-mvc-mvp-mvvm-design-pattern-in-terms-of-coding-c-sern-in-terms-of-coding-c-s "What is difference between MVC, MVP & MVVM design pattern in terms of coding c#")
