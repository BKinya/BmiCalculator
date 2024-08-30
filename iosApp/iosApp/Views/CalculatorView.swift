import SwiftUI
import Shared

struct CalculatorView: View {

    /**
     TODO:
    1. Make sex boxes clickable and capture the value ✅
     2. Hoisting the value of height and capturing it here
     3. Updating the value of height and weight and capturing it here
     4. Clicking calculate button should call the shared logic
     5. When you get the result show in the result view
     6. Animate showing the result view
     */
    @State var isMaleSelected: Bool = true
    @State var isFemaleSelected: Bool = false
  
    var body: some View {
        VStack {
            TitleComponent()

            HStack{
                SexComponent(
                    isSelected: isMaleSelected,
                    tapAction: {
                        isMaleSelected = !isMaleSelected
                        isFemaleSelected = !isFemaleSelected
                        
                    }
                )
                    
                SexComponent(
                    isSelected: isFemaleSelected,
                    label: "Female",
                    imageId: "female",
                    tapAction:{
                        isMaleSelected = !isMaleSelected
                        isFemaleSelected = !isFemaleSelected
                }
            )
        }
            .frame(maxWidth: .infinity, alignment: .center)
            
            HeightComponent()
            
            HStack{
                WeightAgeComponent(
                label: "Weight")
                WeightAgeComponent(
                label: "Age")
            }.frame(maxWidth: .infinity, alignment: .center)

            Spacer()
            ButtonComponent(backgroundColor: .pink, buttonText: "Calculate", clickAction: {
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
