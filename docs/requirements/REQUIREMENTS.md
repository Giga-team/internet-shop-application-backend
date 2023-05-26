# General description
Marketplace application(Rozetka for example), adapted for Android (and WEB)

# Actor
- *Guest*: user without authentication
- *Customer*: signed-in user, who can purchase
- *Admin*: user, who can manage products and customers

# Use cases
### Guest
1) Guest can see all goods
2) Guest can receive data of specific item(name, quantity, description, price, etc)
3) Guest can choose any category
4) Guest can add his goods to shopping cart

### Customer
0) Customer can use all features of guest
1) Customer can see information about himself(name, email, last viewed pages, payment cards)
2) Customer can confirm his intention to buy goods from shopping cart
3) Customer can spend *bonuses* - points received from purchase
4) Customer can give feedback about product and star it (1-5)

### Admin
1) Admin can edit(create, update, delete) data about products 
2) Admin can manage users(block for example)
3) Admin can track all orders(Optional)