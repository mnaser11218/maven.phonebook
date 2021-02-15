# Phone Book
* **Objective** - To implement a `PhoneBook` class which maps a `name` to many `phoneNumber`
* **Purpose** - To establish familiarity `Map`


### Building a `SimplePhoneBook` class
* Create a `simplePhoneBook` class that holds a single phone-number per single name
* You can use an [associative data type](https://en.wikipedia.org/wiki/Associative_array) (one which stores items as keys paired with values).

* Your PhoneBook class should have the following method
	* `void add(String name, String phoneNumber)`
		* adds an entry to the composite associate data type
	* `void remove(String name)`
		* removes an entry to the composite associate data type
	* `Boolean hasEntry(String name)`
		* removes an entry to the composite associate data type		
	* `String lookup(String name)`
		* returns a phone number for the respective input `name`
	* `String reverseLookup(String phoneNumber)`
		* returns a name for the respective input `phoneNumber`
	* `List<String> getAllContactNames()`
		* returns a list of all names in this `PhoneBook`
		
### Building a `AdvancedPhoneBook` class
* Create a `PhoneBook` class that holds names and phone numbers.
* You can use an [associative data type](https://en.wikipedia.org/wiki/Associative_array) (one which stores items as keys paired with values).

* Your PhoneBook class should have the following method
	* `void add(String name, String phoneNumber)`
		* adds an entry to the composite associate data type
	* `void addAll(String name, String... phoneNumbers)`
		* adds many phone numbers to a single name entry
	* `void remove(String name)`
		* removes an entry to the composite associate data type
	* `Boolean hasEntry(String name)`
		* removes an entry to the composite associate data type		
	* `List<String> lookup(String name)`
		* returns a phone number for the respective input `name`
	* `String reverseLookup(String phoneNumber)`
		* returns a name for the respective input `phoneNumber`
	* `List<String> getAllContactNames()`
		* returns a list of all names in this `PhoneBook`


## How to Download

#### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


#### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

#### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
  * if you do not have a `~/dev` directory, make one by executing the following command:
    * `mkdir ~/dev`
  * navigate to the `~/dev` directory by executing the following command:
    * `cd ~/dev`
  * clone the project by executing the following command:
    * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

#### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: ${number_of_tests} of ${number_of_tests} tests`







## How to Submit

#### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
      * `git add .`
    * commit changes to be pushed
      * `git commit -m 'I have added changes'`
    * push changes to your repository
      * `git push -u origin master`

#### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`
