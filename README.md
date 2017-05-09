# PrefManager
Simple wrapper class for Android `PreferenceManager`, which supports only basic functions using `DefaultSharedPreferences`.
The main purpose is to remove the need to call
```Java 
PreferenceManager pref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
Editor editor = pref.edit();
editor.putString(key, value).commit();
```

and replace it with 
```Java
PrefManager prefManager = new PrefManager(context);
prefManager.putString(key, value);
```

Get preferences by calling:
```Java
String output = prefManager.getString("Parameter", "default string");
```

Set your debug tag and show log by calling the static methods:
```Java
PrefManager.setDebugTag(String debugTag);
PrefManager.showLog(true);      // default = false
```

It supports the following data types:
- String 
- long
- int
- float
- boolean

## Download
In the project Gradle:
```Gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

In the app Gradle:
```Gradle
dependencies {
    compile 'com.github.tingyik90:prefmanager:1.0'
}
```
