import SwiftUI
import Shared

struct CalculatorView: View {

    /**
     TODO:
     4. Clicking calculate button should call the shared logic...
     5. When you get the result show in the result view
     6. Animate showing the result view
     */
    @State var isMaleSelected: Bool = true
    @State var isFemaleSelected: Bool = false
    
    @State var height: Float = 53.0
    @State var weight: Int = 0
    @State var age: Int = 0
    
    @State var showResultScreen: Bool = false
  
    var body: some View {
        VStack {
            TitleComponent()

            HStack{
                GenderComponent(
                    isSelected: isMaleSelected,
                    tapAction: {
                        isMaleSelected = true
                        isFemaleSelected = false
                        
                    }
                )
                    
                GenderComponent(
                    isSelected: isFemaleSelected,
                    label: "Female",
                    imageId: "female",
                    tapAction:{
                        isMaleSelected = false
                        isFemaleSelected = true
                }
            )
        }.frame(maxWidth: .infinity, alignment: .center)
            
        HeightComponent(
                height: height,
                onHeightChanged: {newHeight in
                    height = newHeight
                }
        )
            
        HStack{
            WeightAgeComponent(
                label: "Weight",
                value: weight,
                onValueChanged: { newWeight in
                    weight = newWeight
                }
        )
            
            WeightAgeComponent(
                label: "Age",
                value: age,
                onValueChanged:{ newAge in
                    age = newAge
                } )
        }.frame(maxWidth: .infinity, alignment: .center)

        Spacer()
        ButtonComponent(backgroundColor: .pink, buttonText: "Calculate", clickAction: {
            // call a method from the shared folder
            print("My first reusable components")
        }).padding(.bottom, 7)

        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .background(darkNavy)


    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        CalculatorView()
    }
}
