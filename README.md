# Currency Converter Application

## Description

This project is a Java-based currency converter application that interacts with the ExchangeRate-API to fetch real-time exchange rates. Users can select predefined currency conversions or input custom currency codes to perform conversions interactively.

## Features

- Converts between predefined currency pairs:

- USD to ARS (Argentine Peso)

- ARS to USD

- USD to BRL (Brazilian Real)

- BRL to USD

- USD to COP (Colombian Peso)

- COP to USD

- Supports custom currency pair conversions by entering currency codes manually.

Fetches real-time exchange rates using the ExchangeRate-API.

Provides robust error handling for invalid input or API errors.

## Prerequisites

- Java 11 or higher: The application uses the java.net.http package introduced in Java 11.

- ExchangeRate-API Key: A valid API key from ExchangeRate-API. Update the API_URL in the ConseguirValor class with your API key.

## Installation

Clone the repository:

git clone https://github.com/yourusername/currency-converter.git
cd currency-converter

Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse) or ensure the javac compiler is installed on your system.

Replace the API key in the ConseguirValor class:

private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY_HERE/pair/";

## Usage

Compile the Java files:

javac *.java

Run the application:

java Principal

Follow the on-screen menu to select your desired conversion option:

Options 1-6 are predefined conversions.

Option 7 allows you to input custom currency codes.

Input the amount you want to convert when prompted.

View the converted amount and the current exchange rate.

Code Structure

TransformarValor: Handles the logic for converting currencies and interacts with the user.

Principal: Main entry point for the application, provides a menu-driven interface.

ConseguirValor: Manages API requests to fetch exchange rates.

ValorMoneda: Represents the structure of the JSON response from the API.
