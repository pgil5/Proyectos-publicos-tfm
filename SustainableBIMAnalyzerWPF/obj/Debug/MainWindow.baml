   M S B A M L   `   `   `  ����T  PSustainableBIMAnalyzerWPF, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullE'clr-namespace:SustainableBIMAnalyzerWPFSustainableBIMAnalyzerWPF  5   	   *    $SustainableBIMAnalyzerWPF.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   9local'clr-namespace:SustainableBIMAnalyzerWPF     5   	     � Title$  
MainWindow��5   	   $��440.8��6   $	��894��6+   .��5	      �  � RowDefinitions 5
   
   �� 5      $��40 �6   �� 5      $��* �6   �� 5      $��24 �6    � ColumnDefinitions 5   
   �� 5      $��* �6   .+�5   
   c�  J� RenderTransformOrigin$ 
1.438,0.05&�6    `� IsLocked . .@�5      �� -   5        $
��Left=�5      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��5      �� $
��auto��6   $
��auto��6+   .+�5      �� $��20��6   $��20��6(   $��
import.png��63   �� 5      $��Import��6   $��Center=�6-   $��0q�6H   5      5      �� 5      -   5        $
��Left=�5      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��5      �� $
��auto��6   $
��auto��6+   .+�5      �� $��20��6   $��20��6(   $��
export.png��63   �� 5      $��Export��6   $��Center=�6-   $��0q�6H   5       5!      �� 5"      -   5        $
��Left=�5"      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��5#      �� $
��auto��6   $
��auto��6+   .+�5$      �� $��20��6   $��20��6(   $��
select.png��63   �� 5%      $��Select��6   $��Center=�6-   $��0q�6H   5&      5'      �� 5(      -   5        $
��Left=�5(      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��5)      �� $
��auto��6   $
��auto��6+   .+�5*      �� $��20��6   $��20��6(   $��move.png��63   �� 5+      $
��Move��6   $��Center=�6+   $��0q�6F   5,      5-      �� 5.      -   5        $
��Left=�5.      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��5/      �� $
��auto��6   $
��auto��6+   .+�50      �� $��20��6   $��20��6(   $��
zoomin.png��63   �� 51      $��Zoom In��6   $��Center=�6.   $��0q�6I   52      53      �� 54      -   5        $
��Left=�54      $��Center=�60   $��55��6K   $��40��6V   $��0,-2,0,-2.8q�6b   $��8(�6�   $��Center=�6�   .��55      �� $
��auto��6   $
��auto��6+   .+�56      �� $��20��6   $��20��6(   $��zoomout.png��63   �� 57      $��Zoom Out��6   $��Center=�6/   $��0q�6J   58      59      �� 5:      -   5        $��Center=�5:      $��Center=�62   $��55��6M   $��40��6X   $��0,-2,0,-2.8q�6d   $��8(�6�   $��Center=�6�   ��6�   Z� ��6�   Z� .��5;      �� $
��auto��6   $
��auto��6+   .+�5<      �� $��20��6   $��20��6(   $��analyze.png��63   �� 5=      $��Analyze��6   $��Center=�6.   $��0q�6I   5>      5?      5K      � 5O   
   $��0q�6   $��1��6   ���	#FFDCECFF 5P      �� 5Q      $��* �6#   �� 5R      $��5 �6#   �� 5S      $��* �6#   .+�5U      �� $��55(�6   $��Center=�6&   $��Center=�6C   $
��Wrap=�6^   	Left side6}   �� 5V      $��1��6   $��5��6+   $��Stretch=�65   ���	#FF8598B76S   �� 5W      $��2��6   $��55(�6(   $��Center=�66   $��Center=�6S   $
��Wrap=�6n   
Right side6�   5X      ]� 5Y   
   $��2��6   
�������.+�5Z      � $��0��6   $��Center=�6*   $	��200��6E   $��16��6Q   $��3,0,0,0q�6]   $
��Left=�6n    � Value$ 75Q�6�    � IsIndeterminate . 6�   � 5[      $��Right=�6    5\      �� 5]      �� 5^      �� 5_      .+�5a      �� -   5         ��Name$
 zoom��5a      $��0��6'   $��22��67   $	��220��6C    � Maximum$	 100Q�6O   	 �� TickPlacement$	 BottomRight=�6]   
 �� TickFrequency$
 10Q�6y    � SmallChange$ 1Q�6�   �� 5b      $��1��6   $��32��6*    �� TextAlignment$ Right=�6�   $��Right=�6�   $��10,0,0,0q�6�   $��Center=�6�   ��65   ��  �� ElementName$
 zoom�� �� Path$ Value� �� UpdateSourceTrigger$ PropertyChanged=�6�   �� 5c      $��2��6   $��%��6(   $��20��64   $��Center=�6@   $��20��6[   $��0q�6f   $��Right=�6r   $��3,3,15,0q�6�   5d      5e      5h      5i      