function bmi(weight, height) {
    console.log(Number(height) * Number(height))
  
  
  let adjustedBMI = Number(weight) / (Number(height) * Number(height));
  if (adjustedBMI <= 18.5)  {
    return "Underweight";
  }
  else if (adjustedBMI <= 25 && adjustedBMI > 18.5) {
    return "Normal";
  }
  else if (adjustedBMI <= 30 && adjustedBMI > 25) {
    return "Overweight";
  }
  else {
    return "Obese";
  }
}