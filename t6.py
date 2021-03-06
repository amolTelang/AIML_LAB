import sklearn

import pandas as pd

from sklearn.datasets import load_iris

iris=load_iris()

print(iris.keys())

df=pd.DataFrame(iris['data'])
print("0 \n ")
print(df)
print("1 \n ")
print(iris['target_names'])
print("2 \n")

iris['feature_names']

X=df

y=iris['target']


#Splitting the data
from sklearn.model_selection import train_test_split

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.33, random_state=42)

#KNN Classifier and Training of the Model
from sklearn.neighbors import KNeighborsClassifier

knn=KNeighborsClassifier(n_neighbors=3)

knn.fit(X_train,y_train)

#Prediction And Accurancy

import numpy as np

#x_new=np.array([[5,2.9,1,0.2]])
x_new = np.array([[6.3,2.5,5.0,1.9]])
prediction=knn.predict(x_new)
iris['target_names'][prediction]

#Demo
from sklearn.metrics import confusion_matrix

from sklearn.metrics import accuracy_score

from sklearn.metrics import classification_report

y_pred=knn.predict(X_test)

cm=confusion_matrix(y_test,y_pred)

print(cm)

print(" correct predicition",accuracy_score(y_test,y_pred))

print(" worng predicition",(1-accuracy_score(y_test,y_pred)))

import matplotlib.pyplot as plt
plt.plot(y_test,y_pred)
plt.show()

