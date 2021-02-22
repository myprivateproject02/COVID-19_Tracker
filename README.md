<img src="sample_img/mask.svg" width="100" >
# COVID-19_Tracker 


<!-- Blockquote -->
<!-- Strong -->

>  This Is A Live Covid-19 tracker Application With Advance Library.

### Download Apk File
https://mega.nz/file/f89hRQSB#k0-KGsR7hjflP3sJKGc8f5pF0gagiRSNOsYBkHy8Xxg


#### 👉  Implementing Retrofit And RxJava with Hilt (dependency injection).
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

#### 👉  Features Of This App
##### 1. Showing Live Corona Cases.
##### 1. Showing Cases Of All Countries
##### 3. Showing Live Indina State Cases.


<!------------
-->

## 👉  Some ScreenShorts

<p align="center">
  <img src="https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/Screenshot_1601179420.png" width="250">
  <img src="https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/Screenshot_1601178533.png" width="250">
  <img src="https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/Screenshot_1601178545.png" width="250">
  <img src="https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/Screenshot_1601178550.png" width="250">
</p>
<br>

<!------------
-->

** Keep your code clean according to MVVM**
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

  ![mvvm2](https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/img1.png)
  
<!------------
-->
  
  ### 👉  Why RxJava?
  -----------------------------
  
  Reactive extensions in Java allow you to manipulate multiple actions that occur due to certain system events simultaneously. Rx gives you a possibility to use
  functional transformations over streams of events and it doesn't require using nasty things like callbacks and global state management.

##### 👉  If You Want To Dont't Load On Ui Thread Then You Should Use Background Thread. RxJava Doing Same For That Workd.
  <p align="center">
  <img src="https://github.com/myprivateproject02/COVID-19_Tracker/blob/master/sample_img/rxJavaImg.png" width="250">
  </p>
  <br>

 




### 👉  Library reference resources:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. Hilt : https://developer.android.com/training/dependency-injection/hilt-android
3. Retrofit : https://github.com/amitshekhariitbhu/Fast-Android-Networking
4. Glide: https://github.com/bumptech/glide
5. LiveData And ViewModel: https://developer.android.com/jetpack/androidx/releases/lifecycle



## MIT License

Copyright (c) 2020 myprivateproject02

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
