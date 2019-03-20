# Android MVC AppList

### Requirements
Build an app which will parse data from a CSV source and store it in a list of models. It will display a list of names in the first activity and then show the details in the second.

> Be sure to build and test your app at the end of each stage. You may need to add test code in your main activity to test some early features. ie. After you finish writing the `getAppListings` method, call it from your `AppRepository` from the main activity. Add breakpoints and make sure all the data ended up where you expected it to be.

### Part 1 - Create an Android Studio Project
1. Create a new Android Studio project
2. Name the project "App List"
3. Make sure that the target API level is below that of your testing environment.

### Part 2 - Build the Data Model
1. Open the "Mock Data" file in a text editor.
2. Look at the headers
3. Build a model class called `AppListing` to store those values and use the header names as guided for your variable names
4. Be sure to have your data members be private and to generate getters and setters

### Part 3 - Write a Repository Class
1. Create a class called `AppRepository`
2. Add a final string value called `APP_DATA`
3. Write a static method in that class called `getAppListings` which will return an `ArrayList` of `AppListing` objects
4. In this method, you'll use (String.split)[https://developer.android.com/reference/java/lang/String.html#split(java.lang.String)] to parse the data from a CSV string.
   1. Call the split method on your `APP_DATA` data member and pass it the newline character (`APP_DATA.split('\n')`) and store the result in `appStrings`
   5. Create an `ArrayList` of `AppListing` objects and initialize it with a new `ArrayList`
   6. Write a for each loop to loop through `appStrings`
      1. In each loop call `split` on the provided string and pass it a comma character `','`
      7. Store that result as a String Array (`String[]`)
      8. Build a new `AppListing` by grabbing the values you need at their indicies in the array.
      > You can run the debug tool with breakpoint right after the second split to see which values are at which index in your array  

      
      4. Add your new listing to the `ArrayList` created previously
   7. Return the `ArrayList`

### Part 4 - Build Layout for the  List activity

1. Open the app's activity_main.xml file.
4. Add a `ScrollView` to list all previously viewed images. Give it a linear layout child.
> Set the `orientation` attribute to `vertical`

6. Add IDs to all the views that will need to be accessed in the code.

### Part 5 - Add a click listener to the items in the list

1. In your `TextView` generator give the `TextView` object a listener that will get the tag from the element, use that to pull the `ImageData` object from the `List`.
2. Use `intent.putExtra()` to add the object to the intent

### Part 5.1 - Populate List

1. In your main activity, call your repository's `getAppListings` method and store the result
2. Iterate through the list using a for each loop, build a text view with each element and add it to the view.

### Part 6 - Build the layout for the details activity

1. Design a layout that will display details about the app.

### Part 7 - Retreive the Object from the Intent

1. Use `getIntent()` to get the intent used to launch this activity.
2. Use the `intent.getSerializableExtra()` method to retreive the serialized data and then cast it to `ImageData`.
  * the final line of code should look something like this `myObject = (ImageData)intent.getSerializableExtra("KEY")`  

### Part 8 - Display data from the Model Object

1. Get the data from the object and display it in the view.
