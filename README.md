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
prefManager.getString(key, defaultValue);
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

## License
Copyright 2017 Saw Ting Yik

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
