# CalPal - Calorie Tracker

## Team 7: 
* Dominic Labutay 
* Bhagyesh Rathi
* Brendan Requierme 

## Team members working on the proposal: 
* Dominic Labutay : Added problem/issue to resolve, assumption and operating enviorment section. Helped in writing the plan. Created state diagram.
* Bhagyesh Rathi : Created the proposal(readme) in markdown format, suggested and wrote plan and operation part of the proposal. Also added references. Created timing diagram for the project.  
* Brendan Requierme :  Added the functionality and usage part of the proposal. Also helped in suggesting and writing the plan. Created use case and class diagram.

## Team members working on the presentation: 
* Dominic Labutay : Explained design patter used, signup and login. 
* Bhagyesh Rathi : Created slides for the presentation introduced the group and project, explained logistics and technologies used, Explained all the project features. Also demoed the application. 
* Brendan Requierme : Helped in creating the slides, explained the goals and preferences, and actual dashboard of the application as well as overviewd the project. 

## Team members working on the project(code): 
* Bhagyesh Rathi : Initialized project with all the dependencies, created front end with bootstrap, added mongodb api, user model and CRUD operations for springboot and mongodb, styled the application. 
* Dominic Labutay : Helped with mongodb implementation, added routes, login and signup logics. Also helped with styling the dashboard. Added calorie tracking form. 
* Brendan Requierme : Implemented the food central API, that gets the food information and works according to that. Created the preferences page and logic behind it.

## Team members working on the project report:
* Bhagyesh Rathi : Creted and wrote the report for the project.
* Dominic Labutay : Updated UML diagrams.
* Brendanm Requierme : Updated Class diagram.

## Problem/issue to resolve: 
* People having trouble with dieting/counting their calories
  
## Links of current implementations example:
* https://www.myfitnesspal.com/
* https://cronometer.com/

## Assumptions: 
* People insert the food and calories they track
## Operating Enviorment: 
* It will be a website on your computer or code that can run on your localhost
## Usage: 
* This app will be to count your calories and to get suggestions on what to eat next based on if you’ve had breakfast, lunch, dinner and your calorie goal

## Diagrams:
* UML Diagrams

|Image|Description|
|--|--|
|[CS151 CalorieTracker State Diagram.png](https://github.com/domlabutay/CS151-CalorieTracker/blob/main/diagrams/CalorieTrackerSD.png)|Contains the State Diagram for CalorieTracker|
|[CS151 Calorie Tracker Class Diagram.pdf](https://github.com/domlabutay/CS151-CalorieTracker/blob/main/diagrams/CS151%20Calorie%20Tracker%20Class%20Diagram.pdf)|Contains the Class Diagram for CalorieTracker|
|[CS151 Calorie Tracker Use Case Diagram.pdf](https://github.com/domlabutay/CS151-CalorieTracker/blob/main/diagrams/CS151%20Calorie%20Tracker%20Use%20Case%20Diagram.pdf)|Contains the Use Case Diagram for CalorieTracker|
|[CS151 Calorie Tracker Timing Diagram.png](https://github.com/domlabutay/CS151-CalorieTracker/blob/main/diagrams/CS-151%20Calorie%20Tracker%20Timing%20Diagram.png)|Contains the Timing Diagram for CalorieTracker|
|[CS151 Calorie Tracker Sequence Diagram.png](https://github.com/domlabutay/CS151-CalorieTracker/blob/main/diagrams/CS151%20Calorie%20Tracker%20Sequence%20Diagram.png)| Contains the Sequence Diagram for CalorieTracker|


## Functionality: How our solution tackles the issues?
This solution will tackle all of the issues in one central place. The application will allow a person to easily keep track of their calories by calculating the calories they have consumed each day based on their food input. On top of providing recommendations for foods, the app will also provide recipes for their recommendations, giving users a personal experience and an opportunity to make the dishes themselves. The app will also contain a feature where users can track their daily nutritional intake based on the foods they have eaten, providing an extra layer of personalization that helps them visualize the healthiness of the food they eat. 

## Operations: Expected User operations
#### User:
* Create account
* Add in favorite foods and recipes
* Input food eaten for the day
* List allergies/dislikes (to avoid food referrals)
* Create a calorie count goal
* Get recipe for dishes

## Solution:
We solved the solution for the people who were having hard time keeping track of their calorie and to reach their goal of losing or gaining weight. Most of the diseases these days are due to obesity and unbalanced dies. Our applicaiton solved this problem by tracking the calorie count, setting the goal so that user can reach their weight goal. 

# Steps to run the application:
* Download the code from : [CalPal](https://github.com/domlabutay/CS151-CalorieTracker.git)
* Once downloaded, open the code files in appropriate IDE.
* Navigate to CS151-CalorieTracker -> src -> main -> java -> com -> calorietracker
* Run the 'CalorietrackerApplication.java' file.
* open the web browser (Chorme recommended) and type "localhost:8080" in the url bar and hit enter
* Application is now running. If you can't see the homepage, download all the dependency according to 'pom.xml' file in the project.

# Snapshots of the running program:
1. Homepage:
<img width="1436" alt="Screenshot 2022-12-04 at 10 58 57 PM" src="https://user-images.githubusercontent.com/63847327/205569875-ee35e7d9-047e-44ac-8537-300154ad3d66.png">

2. About page: 
<img width="1437" alt="Screenshot 2022-12-04 at 10 59 39 PM" src="https://user-images.githubusercontent.com/63847327/205570064-e751a5c1-e4e6-4f33-8b70-7a68007c2ab8.png">

3. Login page: 
<img width="1439" alt="Screenshot 2022-12-04 at 11 00 22 PM" src="https://user-images.githubusercontent.com/63847327/205570270-dfa9ec99-13fa-40dd-8038-5fe204a7a044.png">

4. Signup Page: 
<img width="1440" alt="Screenshot 2022-12-04 at 11 00 49 PM" src="https://user-images.githubusercontent.com/63847327/205570439-028349a6-e45f-4bd4-8896-187d5411765b.png">

5. Contact Page:
<img width="1440" alt="Screenshot 2022-12-04 at 11 01 26 PM" src="https://user-images.githubusercontent.com/63847327/205570577-6c6e1634-908b-45ae-9276-5c92d8482e77.png">

6. Dashboard:
<img width="1440" alt="Screenshot 2022-12-04 at 11 02 09 PM" src="https://user-images.githubusercontent.com/63847327/205570811-cbe84e48-deac-4504-9c68-c52daeb3231c.png">

7. Preferences page:
<img width="721" alt="Screenshot 2022-12-04 at 11 03 20 PM" src="https://user-images.githubusercontent.com/63847327/205571218-2691796e-e6e0-4aca-a642-c1a0af9f8d65.png">


## References: 

* [1]. API KEY: FOOD DATA CENTRAL https://fdc.nal.usda.gov/api-guide.html
* [2]. https://api.data.gov/docs/api-key/ ← How to use the API Key
