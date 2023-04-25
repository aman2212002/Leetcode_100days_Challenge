import numpy as np

def calculate_f1_score(confusion_matrix):
    # calculate precision for class 1
    precision_1 = confusion_matrix[1, 1] / (confusion_matrix[1, 1] + confusion_matrix[0, 1] + confusion_matrix[2, 1] + confusion_matrix[3, 1])
    
    # calculate recall for class 1
    recall_1 = confusion_matrix[1, 1] / (confusion_matrix[1, 1] + confusion_matrix[1, 0] + confusion_matrix[1, 2] + confusion_matrix[1, 3])
    
    # calculate f1 score for class 1
    f1_score_1 = 2 * (precision_1 * recall_1) / (precision_1 + recall_1)
    
    # calculate precision for class 2
    precision_2 = confusion_matrix[2, 2] / (confusion_matrix[2, 2] + confusion_matrix[0, 2] + confusion_matrix[1, 2] + confusion_matrix[3, 2])
    
    # calculate recall for class 2
    recall_2 = confusion_matrix[2, 2] / (confusion_matrix[2, 2] + confusion_matrix[2, 0] + confusion_matrix[2, 1] + confusion_matrix[2, 3])
    
    # calculate f1 score for class 2
    f1_score_2 = 2 * (precision_2 * recall_2) / (precision_2 + recall_2)
    
    # average the f1 scores for both classes
    f1_score = (f1_score_1 + f1_score_2) / 2
    
    return f1_score