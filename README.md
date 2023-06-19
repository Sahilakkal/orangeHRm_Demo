# orangeHRm_Demo
import pandas as pd
import tkinter as tk
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

# Step 1: Load the dataset
data = pd.read_excel('dataset.xlsx')

# Step 2: Preprocessing and Encoding
vectorizer = CountVectorizer()
X = vectorizer.fit_transform(data['Requirements'])

# Encode the domain using one-hot encoding
domain_encoded = pd.get_dummies(data['Domain'])

# Concatenate the encoded domain with the vectorized requirements
X_encoded = pd.concat([pd.DataFrame(X.toarray()), domain_encoded], axis=1)

# Encode the user stories as numerical labels
y_encoded = pd.factorize(data['User Story'])[0]

# Step 3: Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X_encoded, y_encoded, test_size=0.2, random_state=42)

# Step 4: Train the Random Forest Classifier
model = RandomForestClassifier()
model.fit(X_train, y_train)

# Step 5: Evaluate the model
y_pred = model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy:", accuracy)

# Step 6: Create a User Interface
def predict_user_story():
    requirements = entry_requirements.get()
    domain = entry_domain.get()
    
    # Preprocess the input data
    X_input = vectorizer.transform([requirements])
    domain_input = pd.DataFrame(domain_encoded.columns == domain).astype(int)
    X_input_encoded = pd.concat([pd.DataFrame(X_input.toarray()), domain_input], axis=1)
    
    # Predict the user story
    user_story_index = model.predict(X_input_encoded)[0]
    user_story = data['User Story'].iloc[user_story_index]
    
    # Update the output label
    output_label.configure(text="Predicted User Story: {}".format(user_story))

# Create the GUI
window = tk.Tk()

label_requirements = tk.Label(window, text="Requirements:")
label_requirements.pack()
entry_requirements = tk.Entry(window)
entry_requirements.pack()

label_domain = tk.Label(window, text="Domain:")
label_domain.pack()
entry_domain = tk.Entry(window)
entry_domain.pack()

predict_button = tk.Button(window, text="Predict", command=predict_user_story)
predict_button.pack()

output_label = tk.Label(window, text="Predicted User Story: ")
output_label.pack()

window.mainloop()
