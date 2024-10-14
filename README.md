Project Overview


The project reads inventory data from a file, processes it, and displays it in a user-friendly format allowing the user to also filter the inventory view by, software, music, book individually..

Key Components:
1. Item Class
The Item class is the base class representing a general item in the store. 
It contains common attributes such as:
title: The name of the item.
price: The price of the item.

Key methods:
getTitle(): Retrieves the title of the item.
getPrice(): Retrieves the price of the item.
getItemType(): Returns the type of the item (book, music, software).
equals() and hashCode(): Methods for comparing and hashing items.

2. Book Class
A subclass of Item, the Book class represents a book in the store. 
It contains additional attributes such as:
authors: The name(s) of the authors.
edition: The edition of the book.
publisher: The book's publisher.
pubYear: The publication year of the book.

Key methods:
getBookDetails(): Returns a formatted string with all the details of the book.

3. MusicCD Class
A subclass of Item, the MusicCD class represents a music CD. 
It contains additional attributes such as:
artists: The artist(s) of the music CD.
releaseDate: The release date of the CD.
label: The music label.
genres: The genre of the music.

Key methods:
getMusicCDDetails(): Returns a formatted string with all the details of the music CD.

4. Software Class
A subclass of Item, the Software class represents a piece of software. 

It contains the additional attribute:
version: The version of the software.
Key methods:
getSoftwareDetails(): Returns a formatted string with all the details of the software.

5. ItemEntry Class
The ItemEntry class represents an inventory entry, consisting of an item and a quantity. It is used to manage the stock of each item.
Key methods:
getItem(): Returns the item in the entry.
getQuantity(): Returns the quantity of the item.
toString(): Returns a formatted string with the item's details and quantity.

6. ItemInventory Class
The ItemInventory class manages a collection of ItemEntry objects, representing the store's inventory.
Key methods:
load(String file): Loads the inventory from a text file (Inventory.txt).
addItemEntry(ItemEntry entry): Adds a new item to the inventory.
removeItemEntry(ItemEntry entry): Removes an item from the inventory.
findItemEntryByTitle(String title): Searches for an item by its title.
displayAllItems(): Displays all the items in the inventory.

7. OnlineStore Class
The OnlineStore class provides the main interface for the store. 
It interacts with users and provides the following features:
Display all items in the inventory.
Filter items by type (music, book, software).
Key methods:
start(): Loads the inventory from a file and starts the store interface.
displayInventory(): Displays the full inventory in a formatted table.
searchItem(String title): Searches for an item by title and displays its details.
displayItemsByType(String type): Filters and displays items by their type (music, book, software).

8. Inventory.txt
This file contains the store's inventory data. Each line contains details about an item, such as its type, title, price, and other attributes.