# RangeSeekBar
Simple range seek widget for Android

![](/gifs/months.gif)

### Add library

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```groovy
dependencies {
    ...
    implementation 'com.github.faizator:RangeSeekBar:1.0'
}
```

### Declare in layout

```xml
<com.faz.widgets.rangeseekbar.RangeSeekBar
    android:id="@+id/rangeSeek"
    android:layout_width="match_parent"
    android:layout_height="60dp"
    android:layout_marginTop="1dp"
    app:textSize="12sp"
    app:textColor="@color/black"
    app:activeColor="@color/active"
    app:inactiveColor="@color/inactive"
    app:thumb="@drawable/range_seek_thumb"/>
```

### Use in code

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    rangeSeek.thumbTextGenerator = { value ->
        val selectedMonth = floor(11 * value).toInt()
        monthNames[selectedMonth]
    }
    rangeSeek.rangeSeekBarChangeListener = { minValue, maxValue ->
        Log.d("TAG", "min: $minValue, max: $maxValue")
    }
}

private val monthNames = arrayOf(
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
)
```
