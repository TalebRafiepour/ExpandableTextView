# ExpandableTextView
An extent of AppCompatTextView for handle expand and collapse texts

# setup

Step 1. Add the JitPack repository to your build file

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
dependencies {
	        implementation 'com.github.TalebRafiepour:ExpandableTextView:Tag'
	}
```


# How to use

```
<com.taleb.expndbltxtview.ExpandableTextView android:layout_width="wrap_content"
                                                 android:layout_height="wrap_content"
                                                 android:text="@string/sample_text"
                                                 android:maxLines="2"
                                                 android:layout_gravity="top"
                                                 android:layout_margin="12dp"
                                                 app:animation_duration="500"
                                                 android:ellipsize="end"
                                                 android:id="@+id/expandableTextView"
                                                 app:font_asset_src="fonts/IRANSans(FaNum).ttf"/>
