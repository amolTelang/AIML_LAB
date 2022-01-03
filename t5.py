#https://www.goeduhub.com/3426/demonstrate-and-implement-the-naive-bayesian-classifier?show=3426#q3426
#Import important libraries

import numpy as np

import pandas as pd

#Import dataset

from sklearn import datasets

#Load dataset

wine = datasets.load_wine()

#print(wine)#if you want to see the data you can print data

#print the names of the 13 features

print ("Features: ", wine.feature_names)

#print the label type of wine

print ("Labels: ", wine.target_names)

X=pd.DataFrame(wine['data'])

print(X.head())

print(wine.data.shape)

#print the wine labels (0:Class_0, 1:class_2, 2:class_2)

y=print (wine.target)

# Import train_test_split function

from sklearn.model_selection import train_test_split

# Split dataset into training set and test set

X_train, X_test, y_train, y_test = train_test_split(wine.data, wine.target, test_size=0.30,random_state=109)

#Import Gaussian Naive Bayes model

from sklearn.naive_bayes import GaussianNB

#Create a Gaussian Classifier

gnb = GaussianNB()

#Train the model using the training sets

gnb.fit(X_train, y_train)

#Predict the response for test dataset

y_pred = gnb.predict(X_test)

print(y_pred)

#Import scikit-learn metrics module for accuracy calculation

from sklearn import metrics

# Model Accuracy

print("Accuracy:",metrics.accuracy_score(y_test, y_pred))

#confusion matrix

from sklearn.metrics import  confusion_matrix

cm=np.array(confusion_matrix(y_test,y_pred))

cm
