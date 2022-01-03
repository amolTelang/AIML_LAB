import matplotlib.pyplot as plt
#matplotlib is used to plot the decision tree
from sklearn.datasets import load_iris
#sklearn.datasets is used to import the dataset
from sklearn import tree
#sklearn tree is used to import decision tree classifier


def load_data_set():
  iris = load_iris()
  return iris


def train_model(iris):
   clf = tree.DecisionTreeClassifier(criterion = "entropy")
   #initilzing the the model with criterion entropy
   clf = clf.fit(iris.data, iris.target)
   #training the model
   return clf

def display_image(clf, iris):
    plt.figure()
    plt.figure(figsize=(40, 40))
    tree.plot_tree(clf, feature_names = iris.feature_names,class_names = iris.target_names,filled=True)
    plt.show()


iris_data = load_iris()
#loading the dataset
print(iris_data.feature_names)
print(iris_data.data)
print(iris_data.target_names)
#['setosa' = 0 , 'versicolor' = 1 , 'virginica' = 2]

print(iris_data.target)
decision_tree_classifier = train_model(iris_data)
display_image(decision_tree_classifier, iris_data)
y_pred = decision_tree_classifier.predict([[5.1, 3.5, 1.4, 0.2], [4.9, 3. , 1.4, 0.2],[5.9, 3.0,  5.1, 1.8]])
#[5.1 3.5 1.4 0.2] : 0
#[4.9 3.  1.4 0.2] : 0
#[5.9, 3.0,  5.1, 1.8] : 2

print(y_pred)
