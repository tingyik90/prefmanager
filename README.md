# PrefManager
Simple wrapper class for Android `PreferenceManager`, which supports only basic functions. It is always using
```Java
PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
```

Set your debug tag and show log by calling:
```Java
PrefManager.setDebugTag(String debugTag);
PrefManager.showLog(true);      // default = false
```

Save preferences by calling:
```Java
PrefManager prefManager = new PrefManager(context);
String input = "String to save";
prefManager.putString("Parameter", input);
```

Get preferences by calling:
```Java
String output = prefManager.getString("Parameter", "default string");
```

It includes the following type of data:
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
