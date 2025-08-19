Project 3: Neural Network
------------------------------------------------------------------------------------------------------------------
Code Discussion:
Step 3: Initialize input neurons.
        // For each input neuron, set its input value using the input array.
        // Each input i should be set into each input neuron with index i.
        // Mark each input neuron as visited.
        // Enqueue each input neuron into the queue.
        // Note that this is different from typical BFS where you only enqueue one
        // starting node. Discuss with your team members as to why we do this. Include a
        // summary of your discussion in the readme.

The entire input layer is considered the "starting node", as the input neurons are the only neurons with information, at this point, and all future information is based off of the neurons in this layer, so every input neuron needs to be enqueued.


Step 4: Perform a breadth-first traversal of the network:
        // While the queue is not empty:
        // - Dequeue a neuron from the queue.
        // - Compute its output.
        // - For each adjacent neuron in the network:
        // - If the neuron hasn't been visited:
        // - Mark it as visited and enqueue it.
        // - Pass the current neuron's output as input to the adjacent neuron
        // at the index corresponding to the current neuron's index.

        // Manually perform this modified BFS traversal on the example neural network
        // image provided in the instructions document. Provide the order that you visit
        // each neuron in your readme. Specify each neuron in terms of its layer and the
        // neuron index.



Starting Queue: //input: 0, //input: 1, //input 2, //1st Hidden: 0, //1st Hidden: 1, //1st Hidden: 2, //1st Hidden: 3, //2nd Hidden: 0, //2nd Hidden: 1, //2nd Hidden: 2, //2nd Hidden: 3, //Output: 0, //Output: 1

Modified BFS traversal: 
input: 0 -> 1st Hidden: 0, 1st Hidden: 1, 1st Hidden: 2, 1st Hidden: 3
Input: 1 -> 1st Hidden: 0, 1st Hidden: 1, 1st Hidden: 2, 1st Hidden: 3
input: 2 -> 1st Hidden: 0, 1st Hidden: 1, 1st Hidden: 2, 1st Hidden: 3
1st Hidden: 0 -> 2nd Hidden: 0, 2nd Hidden: 1, 2nd Hidden: 2, 2nd Hidden: 3
1st Hidden: 1 -> 2nd Hidden: 0, 2nd Hidden: 1, 2nd Hidden: 2, 2nd Hidden: 3
1st Hidden: 2 -> 2nd Hidden: 0, 2nd Hidden: 1, 2nd Hidden: 2, 2nd Hidden: 3
1st Hidden: 3 -> 2nd Hidden: 0, 2nd Hidden: 1, 2nd Hidden: 2, 2nd Hidden: 3
2nd Hidden: 0 -> Output: 0, Output: 1
2nd Hidden: 1 -> Output: 0, Output: 1
2nd Hidden: 2 -> Output: 0, Output: 1
2nd Hidden: 3 -> Output: 0, Output: 1
Output: 0 ->
Output: 1 ->




