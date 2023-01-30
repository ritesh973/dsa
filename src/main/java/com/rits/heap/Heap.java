package com.rits.heap;


/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/01/23
 */
public class Heap {

    int arr[];
    int size;
    public Heap(int heapSize){
        this.arr = new int[heapSize];
        this.size = 0;
    }

    void insert(int val){
        size = size+1;
        int index = size;
        arr[index] = val;

        while (index > 1){
            int parent = index/2;
            if (arr[parent]< arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            }else {
                return;
            }
        }
    }
    void delete(){
        if (size == 0){
            return;
        }
        arr[1] = arr[size];
        size--;

       int i =1;

        while (i < size){
            int leftIndex = 2*i;
            int rightIndex = 2*i+1;

            if (leftIndex < size && arr[i] < arr[leftIndex]){
                int temp = arr[i];
                arr[i] = arr[leftIndex];
                arr[leftIndex] = temp;
                i = leftIndex;
            }else if (rightIndex < size && arr[i] < arr[rightIndex]){
                int temp = arr[i];
                arr[i] = arr[rightIndex];
                arr[rightIndex] = temp;
                i = rightIndex;
            }else {
                return;
            }

        }

    }

    void print(){
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    void heapify(int arr[], int n, int i){
        int largest = i;
        int left  = 2*i;
        int right = 2*i+1;
        if (left <= n && arr[largest] < arr[left]){
           largest = left;
        }
        if (right <= n && arr[largest] < arr[right]){
            largest = right;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
    void heapSort(int arr[], int n){
        int size = n;
        while (size > 1){
            int temp = arr[1];
            arr[1] = arr[size];
            arr[size] = temp;
            size--;
            heapify(arr,size,1);
        }

    }
}
