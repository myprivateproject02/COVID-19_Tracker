# COVID-19_Tracker

<!-- Blockquote -->
<!-- Strong -->

>  This Is A Live Covid-19 tracker Application With Advance Library.




#### Implementing Retrofit And RxJava with Hilt (dependency injection).
<!------------
-->


<!--ul-->
* Hilt (dependency injection)
* Viewmodel
* databinding
* Material Design
* Navigation Component
* MVVM Architecture Component

This repository contains a detailed sample app that implements MVVM architecture using Hilt, Room, RxJava, Glide, Navigation Component.

#### Features Of This App
##### 1. Showing Live Corona Cases.
##### 1. Showing Cases Of All Countries
##### 3. Showing Live Indina State Cases.


<!------------
-->

## Some ScreenShorts

<p align="center">
  <img src="https://janishar.github.io/images/mvp-app-pics/mvp-login.png" width="250">
  <img src="https://janishar.github.io/images/mvp-app-pics/main-view.png" width="250">
  <img src="https://janishar.github.io/gifs/mvp-app.gif" width="250">
</p>
<br>
<p align="center">
  <img src="https://janishar.github.io/images/mvp-app-pics/mvp-drawer.png" width="200">
  <img src="https://janishar.github.io/images/mvp-app-pics/mvp-rating.png" width="200">
  <img src="https://janishar.github.io/images/mvp-app-pics/mvp-feed.png" width="200">
  <img src="https://janishar.github.io/images/mvp-app-pics/mvp-empty-state.png" width="200">
</p>
<br>
<br>

<!------------
-->

**Keep your code clean according to MVVM**
-----------------------------
 - Yes , liveData is easy , powerful , but you should know how to use.
 - For livedate which will emit data stream , it has to be in your
   data layer , and don't inform those observables any thing else like
   in which thread those will consume , cause it is another
 - For livedata which will emit UI binding events, it has to be in your ViewModel Layer.
 - Observers in UI Consume and react to live data values and bind it.
   responsibility , and according to `Single responsibility principle`
  in `SOLID (object-oriented design)` , so don't break this concept by
   mixing the responsibilities .

  ![mvvm2](https://user-images.githubusercontent.com/1812129/68319008-e9d39d00-00bd-11ea-9245-ebedd2a2c067.png)


### Why RxJava?
Reactive extensions in Java allow you to manipulate multiple actions that occur due to certain system events simultaneously. Rx gives you a possibility to use functional transformations over streams of events and it doesn't require using nasty things like callbacks and global state management.



### Library reference resources:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. Hilt : https://developer.android.com/training/dependency-injection/hilt-android
3. Retrofit : https://github.com/amitshekhariitbhu/Fast-Android-Networking
4. Glide: https://github.com/bumptech/glide
5. LiveData And ViewModel: https://developer.android.com/jetpack/androidx/releases/lifecycle
