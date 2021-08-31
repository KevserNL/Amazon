Feature: Given Scenario

#Please also, with an automation tool of your choice, build an automated test using amazon.com:
#1. Search for a “Dell Laptop”
#2. Refine your search by clicking on 4GB in the left filter panel
#3. Pick a “2020 Newest Dell Inspiron 15 3000 PC Laptop”
#4. Check the price is $434.00
#5. Add the laptop to your basket
#6. Find a monitor and add to your basket


  @end2end @amazon
  Scenario: Adding the spesific product to the basket
    Given the user is in the main page
    When the user searches for "Dell Laptop"
    And the user refines the search by clicking "4 GB"
    And the user selects the result containing "2020 Newest Dell Inspiron 15 3000 PC Laptop"
    Then the price should be "$434.00"
    Then the user adds the selected product to the basket
    When the user searches for "Monitor"
    And the user selects the result containing "Acer R240HY bidx 23.8-Inch"
    Then the user adds the selected product to the basket







# 4gb requirement should be more clear and in detail  ram, video card memory

# After choosing the monitor, which monitor user is gonna select ?
