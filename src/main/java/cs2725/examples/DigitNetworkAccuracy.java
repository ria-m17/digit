/**
 * Copyright (c) 2025 Sami Menik, PhD. All rights reserved.
 * 
 * Unauthorized copying of this file, via any medium, is strictly prohibited.
 * This software is provided "as is," without warranty of any kind.
 */
package cs2725.examples;

import java.io.File;

import cs2725.api.nn.NeuralNetwork;
import cs2725.impl.nn.DigitsDataset;
import cs2725.impl.nn.SimpleNeuralNetwork;

/**
 * This class tests the accuracy of the neural network using the loaded dataset.
 */
public class DigitNetworkAccuracy {

    private static int getMaxIndex(float[] array) {
        int maxIndex = 0;
        float maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    

    public static void main(String[] args) {
        // Load the dataset
        DigitsDataset dataset = DigitsDataset.load();
        int totalSamples = dataset.size();

        // Instantiate the neural network
        String weightsPath = "resources" + File.separator + "digits_network_weights.txt";
        NeuralNetwork network = new SimpleNeuralNetwork(weightsPath);
        
        // Todo: Project 3: To be implemented

        // Initialize counters to track the number of correct predictions and the total
        // number of samples.

        int counter = 0; 

        // Iterate over each sample:
        // - Retrieve the input vector and the corresponding ground-truth label.
        // - Use the network to predict the label from the input.
        // - Convert the prediction to a discrete label.
        // - Compare the predicted label to the true label and update the correct count
        // if they match.

        for (int i = 0; i < totalSamples; i++) {
            float[] input = dataset.getInput(i); 
            //use the network to predict the label
            int groundTruthLabel = dataset.getLabel(i);


            float[] prediction = network.predict(input); 

            //convert the prediction to a discrete label
            int predictedLabel = getMaxIndex(prediction);
            
            if (predictedLabel == groundTruthLabel) {
                counter++; 
            }


        }

        // Compute the classification accuracy as a percentage.
        double accuracy = (double) counter / totalSamples * 100.0; 


        // Output the accuracy percentage along with the number of correct predictions
        // and total samples.
        System.out.printf("Accuracy: %.2f%%\n", accuracy);
        System.out.println("Correct Predictions: " + counter);
        System.out.println("Total Samples: " + totalSamples);
    }
}