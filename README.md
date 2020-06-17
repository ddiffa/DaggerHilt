# [DaggerHilt](https://dagger.dev/hilt/quick-start)
# Gradle Setup

gradle project

`classpath 'com.google.dagger:hilt-android-gradle-plugin:<version>'`

gradle application


`apply plugin: 'dagger.hilt.android.plugin'`

```
dependencies{
  implementation 'com.google.dagger:hilt-android:<VERSION>'
  kapt 'com.google.dagger:hilt-android-compiler:<VERSION>'

  // For instrumentation tests
  androidTestImplementation  'com.google.dagger:hilt-android-testing:<VERSION>'
  kaptAndroidTest 'com.google.dagger:hilt-android-compiler:<VERSION>'

  // For local unit tests
  testImplementation 'com.google.dagger:hilt-android-testing:<VERSION>'
  kaptTest 'com.google.dagger:hilt-android-compiler:<VERSION>'
}

kapt {
 correctErrorTypes true
}
```

# Cheat Sheet
<img src="https://github.com/ddiffa/DaggerHilt/blob/master/cheat/cheat_sheet1.png"
width="80%">&nbsp;&nbsp;&nbsp;

<img src="https://github.com/ddiffa/DaggerHilt/blob/master/cheat/cheat_sheet2.png"
width="80%">&nbsp;&nbsp;&nbsp;

<img src="https://github.com/ddiffa/DaggerHilt/blob/master/cheat/cheat_sheet3.png"
width="80%">&nbsp;&nbsp;&nbsp;

<img src="https://github.com/ddiffa/DaggerHilt/blob/master/cheat/cheat_sheet4.png"
width="80%">&nbsp;&nbsp;&nbsp;

# Reference 
[Dependency Injection on Android with Hilt](https://medium.com/androiddevelopers/dependency-injection-on-android-with-hilt-67b6031e62d)
