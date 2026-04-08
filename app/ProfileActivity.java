<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:orientation="vertical"
        android:padding="24dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <EditText
            android:id="@+id/inputFirstName"
            android:hint="First Name"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <EditText
            android:id="@+id/inputLastName"
            android:hint="Last Name"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <EditText
            android:id="@+id/inputEmail"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <EditText
            android:id="@+id/inputPassKey"
            android:hint="Pass Key"
            android:inputType="textPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <!-- Add more fields if your customers table requires them -->

        <Button
            android:id="@+id/signupButton"
            android:text="Sign Up"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp" />
    </LinearLayout>
</ScrollView>