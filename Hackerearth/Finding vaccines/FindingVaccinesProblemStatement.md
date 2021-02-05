You are creating a vaccine to fight against a worldwide novel pandemic virus. A vaccine contains a weakened virus that is injected inside people to produce
antibodies to let it fight against the virus. The study of interaction among RNA of various viruses is quite necessary for this. An RNA consists of 
four types of molecules Guanine (G), Adenine (A),Cytosine (C), and Uracil (U).

You are given the structures of RNA for the pandemic virus and several vaccine viruses in the form of strings containing characters G, A, C, U 
 representing respective molecules. 
 
 You know that if there is higher interaction between the pandemic virus and vaccine virus, then better the vaccine will be. 
 You also know that the only interaction between any two RNAs is a result of the interaction between their Guanine (G) and Cytosine (C) molecules.
 Formally, if the strings for RNA structures are s1 and s1, then you must consider the following points: 
 One molecule of Guanine () of s1 and one molecule of Cytosine () of s2 will lead to one unit of interaction.
 One molecule of Guanine () of s2 and one molecule of Cytosine () of s1 will lead to one unit of interaction.
 Any other pair of molecules do not add to any interactions.
In this way, the total interaction between s1 and  s2 is calculated as the sum of individual molecule pair interactions (as discussed above).

You must find the best available vaccine.

Input format

The first line contains a single integer n denoting the number of vaccines
The second line contains a single integerm  denoting the length of the string denoting the RNA structure for the pandemic virus.
The third line contains a string  denoting the RNA structure for the pandemic virus.
Next n lines contains the following lines where:
2i-1 line contains a single integer denoting the length of the string denoting the RNA structure for the  vaccine virus
2i line contains a string  denoting the RNA structure for the  vaccine virus
