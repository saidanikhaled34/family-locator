# Android-Family_locator
 
# Project Problem Statement: 
A Family locator app may sound pretty simple. It should be an easy to use app that uses global positioning satellites (GPS) and a smartphone to give parents up-to-date information about their child’s location. In actuality, the idea of instantaneous tracking of a child’s whereabouts is fairly complex; as is the wide range of options it can offer parents. Monitoring a child’s location can be an invaluable parenting tool,and can go far beyond simple tracking. A Family locator app gives parents a means to ensure children have been and are where they are supposed to be. Family tracking apps can be used with a few intentions – safety, accountability and parental peace of mind. It offers families a life-saving technological innovation in the case of an emergency. In addition, a family locator app like Family locator can let kids explore geographical boundaries allowing a parent to gauge where an intervention is necessary.
Tracking family and friends via Android App. This App fetches the real time location of the user and shows the location on Map. It helps your loved ones to track you and take actions when there is any emergency. This incredible app can locate accurate positions instantly. This helps to know that family, friends and especially your kids are safe everywhere and at every point in time. This app will fetch your current location and address on a click of Button. 

# Screenshots

![Screen 1](https://user-images.githubusercontent.com/26342613/89568845-2fc3ba00-d824-11ea-9502-251875be4fed.png)
![Screen 1](https://user-images.githubusercontent.com/26342613/89568880-3baf7c00-d824-11ea-9b72-6b61f06c994b.png)
![Screen 1](https://user-images.githubusercontent.com/26342613/89568897-40743000-d824-11ea-9c5c-6bdce6b30793.png)
![Screen 1](https://user-images.githubusercontent.com/26342613/89568908-44a04d80-d824-11ea-8184-5daa685b53ad.png)
![Screen 1](https://user-images.githubusercontent.com/26342613/89568919-49650180-d824-11ea-8c91-575b66ae0f17.png)
![Screen 1](https://user-images.githubusercontent.com/26342613/89568927-4d911f00-d824-11ea-9fed-ae6eb145da84.png)


# Get a Google Maps API key

Go to https://developers.google.com/maps/documentation/ios-sdk/get-api-key and https://developers.google.com/maps/documentation/android-api/signup to get your keys for both iOS and Android.

Make sure that Google Maps Android API and Google Maps SDK for iOS are enabled for the current project. https://console.developers.google.com/apis/library/maps-android-backend.googleapis.com/ https://console.developers.google.com/apis/library/maps-ios-backend.googleapis.com

Without an API key the Google Maps map won't render anything.

### How it works?
![firebase](https://user-images.githubusercontent.com/31361652/38167172-bf4b498e-34e5-11e8-9028-4bcbdfb907b3.png)



- The first device get continous location update from gps, network etc. then
- Write and update the location data to a specific firebase firestore document
- Last, the second device read that firebase firestore document and show the marker in that location

# Features:

1.	Sign up form for new user to create an account. A new user record is created in Google Firebase. If an already existing user tries to sign up, he is prevented in doing the same.

2.	 Login Page to allow only authorized users to login. Performs validation for username and password match.
 
3.	Home Page where users can check current location and check current location in map.

4.	Map Activity shows current location on Google maps.

# Technology Used:

1.	Android Studio 3.5 java

2.	Firebase as database for tracking real time location
 
3.	Android Gradle version 3.5

4.	Material Design for JustMind.


# Future Enhancements

1. Add more features for tracking Anomoly when the location is unusual.

