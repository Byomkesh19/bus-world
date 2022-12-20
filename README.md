# hackathon-submission-template
Please use this template for submitting solutions for the Microsoft Future Technology Hackathon 2022

//Problem Statement
As the world grows on, the need to do local travel also increases and for doing so one such important means is Bus journey from small to mid level of traveling. But the passenger are still struggling to find the realtime status of buses in his/her area.
In order to simplify this we create an application which can be used by BusOwners and the passengers , where the busOwner(or Driver) will just need to tell whether the Bus is in running mode or not.
The user can view the available buses for multiple destinations in his/her area.
On the future the busOwner and Customer can get more features with more interaction from them.

//Prototype Source Code Description
The prototype code here is used to simulate starting from login of the user to searching of the buses available and also updating bus status by the BusOwner or drivers.
The user does login at the very first(if not registered then register first). There is separte login for Customer  and BusOwner.
busOwner adds all the buses as per his need and can update whether it is in running mode or stopped.
The bus location will keep on getting refreshed and location can be auto -calculated based on the bus' avg speed of running or other direct check in some cases.
The customer can update his/her location by providing input by himself and if not able to, then to access his location from the device and view the buses around him.
As a scalable code we can later also enable features to let the BusOwner or driver know that a customer is waiting for the bus.
The application can be launched from LaunchAppJava class in the com.deewana.busworld package.
