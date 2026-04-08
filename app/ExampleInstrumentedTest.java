<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.DataEngine" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Set the status and navigation bars to black -->
        <item name="android:statusBarColor">@android:color/black</item>
        <item name="android:navigationBarColor">@android:color/black</item>

        <!-- Keep status bar icons light (for dark background) -->
        <item name="android:windowLightStatusBar">false</item>

        <!-- Removed windowLightNavigationBar to avoid API 27+ conflict -->
    </style>

    <style name="Theme.DataEngine" parent="Base.Theme.DataEngine" />
</resources>