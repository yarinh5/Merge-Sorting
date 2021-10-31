# Merge-Sorting
A system that performs parallel merge sorting of an array of n-length integers

The merge-sort algorithm will be performed as follows
The array will be divided into n single-member arrays that will be inserted into a common repository.
The system will create m merging processes that will run in parallel. Each process will remove two arrays from the repository, merge them and return to the repository one array that constitutes the merger of the two arrays.
The merge processes will continue to merge pairs of arrays until all arrays are merged and the pool remains a single array that constitutes the sorted array.
Finally we will present the sorted array.
