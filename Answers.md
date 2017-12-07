# These are the answers
## Lab 10 Ensminger Lorentz

"Written part: Discuss the differences among the results. Does the starting point make a difference?"

HU | SK
--- | ---
Breadth first HU start Hungary | Breadth first SK start Slovakia
Breadth first HU start Slovakia | Breadth first SK start Hungary
Breadth first HU start Romania | Breadth first SK start Austria
Breadth first HU start Serbia | Breadth first SK start Romania
Breadth first HU start Croatia | Breadth first SK start Serbia
Breadth first HU start Slovenia | Breadth first SK start Croatia
Breadth first HU start Austria | Breadth first SK start Slovenia

> Three of the values are in the same order Serbia Croatia Slovenia

HU | SK
--- | ---
Closest first HU start Hungary | Closest first SK start Slovakia
Closest first HU start Slovakia | Closest first SK start Hungary
Closest first HU start Romania | Closest first SK start Austria
Closest first HU start Serbia | Closest first SK start Romania
Closest first HU start Croatia | Closest first SK start Slovenia
Closest first HU start Slovenia | Closest first SK start Serbia
Closest first HU start Austria | Closest first SK start Croatia

> None of the values are in the same order between the two starting points

HU | SK
--- | ---
Depth first HU start Hungary | Depth first SK start Slovakia
Depth first HU start Austria | Depth first SK start Romania
Depth first HU start Slovenia | Depth first SK start Serbia
Depth first HU start Croatia | Depth first SK start Croatia
Depth first HU start Serbia | Depth first SK start Slovenia
Depth first HU start Romania | Depth first SK start Austria
Depth first HU start Slovakia | Depth first SK start Hungary

> Each list is the reverse of the other

HU | SK
--- | ---
Random walk HU start Croatia | Random walk SK start Romania
Random walk HU start Hungary | Random walk SK start Slovakia
Random walk HU start Austria | Random walk SK start Hungary
Random walk HU start Slovenia | Random walk SK start Slovenia
Random walk HU start Hungary | Random walk SK start Austria
Random walk HU start Croatia | Random walk SK start Slovenia
Random walk HU start Hungary | Random walk SK start Croatia
Random walk HU start Serbia | Random walk SK start Serbia
Random walk HU start Romania | Random walk SK start Hungary
Random walk HU start Slovakia | Random walk SK start Romania
Random walk HU start Austria | Random walk SK start Hungary
Random walk HU start Hungary | Random walk SK start Slovakia

> No values are in the same order in relation to the two start points

"Written part: Give two or three examples of how/why a real-world map might require more than four colors."
Our map only requires 3 colors.
If there was graph that was not planar and on a 3D plane in which there was a spherical map configured in a way where there is a 
spherical center with an outer layer situated in such a way where enugh sections touch on the outside and touch the inner sphere
requiring more than 4 colors. On a world map, it appears that austria and its surrounding countries require more than four colors.
However, the four color theorem proves that while austria shares a border with 7 countries, no more that three of its countries share
a boarder with each other. If four of ts bored countres also shared boarders with each other then the map would require five
colors.
