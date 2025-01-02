names = []

# add items to the list
names.append("kim")
names.append("imo")
names.append("kam")
names.append("jack")

#capitalize each name in the list
for i in range(len(names)):
    
    names[i] = names[i].title()

# sort the names
names.sort()

# print the names
print(names)
