<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="20dp"
    android:background="#FFF7FB">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:id="@+id/tierText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Tier"
            android:textStyle="bold"
            android:textSize="18sp"
            android:layout_marginBottom="8dp"/>

        <TextView
            android:id="@+id/priceText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="$0.00"
            android:textSize="16sp"
            android:layout_marginBottom="16dp"/>

        <Switch
            android:id="@+id/autoRenewSwitch"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Auto-Renewal"
            android:layout_marginBottom="24dp"/>

        <Button
            android:id="@+id/cancelSubscriptionButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Cancel Subscription"
            android:backgroundTint="#FF5555"
            android:textColor="#FFFFFF"/>
    </LinearLayout>
</ScrollView>