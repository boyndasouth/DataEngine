<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".activities.LoginActivity">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="24dp">

        <EditText
            android:id="@+id/inputEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:importantForAutofill="yes" />

        <EditText
            android:id="@+id/inputPassKey"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Pass-key"
            android:inputType="textPassword"
            android:importantForAutofill="yes" />

        <Button
            android:id="@+id/loginButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Login" />
    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>