//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace pruebasConsola.GameCreator
{
    
    
    /// <summary>
    /// The default implementation of the Location class
    /// </summary>
    [XmlIdentifierAttribute("name")]
    [XmlNamespaceAttribute("GameCreator")]
    [XmlNamespacePrefixAttribute("GameCreator")]
    [DebuggerDisplayAttribute("Location {Name}")]
    public partial class Location : ModelElement, ILocation, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Name property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private string _name;
        
        private static Lazy<ITypedElement> _nameAttribute = new Lazy<ITypedElement>(RetrieveNameAttribute);
        
        /// <summary>
        /// The backing field for the FullName property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private string _fullName;
        
        private static Lazy<ITypedElement> _fullNameAttribute = new Lazy<ITypedElement>(RetrieveFullNameAttribute);
        
        /// <summary>
        /// The backing field for the CoordX property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private double _coordX;
        
        private static Lazy<ITypedElement> _coordXAttribute = new Lazy<ITypedElement>(RetrieveCoordXAttribute);
        
        /// <summary>
        /// The backing field for the CoordY property
        /// </summary>
        [DebuggerBrowsableAttribute(DebuggerBrowsableState.Never)]
        private double _coordY;
        
        private static Lazy<ITypedElement> _coordYAttribute = new Lazy<ITypedElement>(RetrieveCoordYAttribute);
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The name property
        /// </summary>
        [DisplayNameAttribute("name")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("name")]
        [IdAttribute()]
        [XmlAttributeAttribute(true)]
        public string Name
        {
            get
            {
                return this._name;
            }
            set
            {
                if ((this._name != value))
                {
                    string old = this._name;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnNameChanging(e);
                    this.OnPropertyChanging("Name", e, _nameAttribute);
                    this._name = value;
                    this.OnNameChanged(e);
                    this.OnPropertyChanged("Name", e, _nameAttribute);
                }
            }
        }
        
        /// <summary>
        /// The fullName property
        /// </summary>
        [DisplayNameAttribute("fullName")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("fullName")]
        [XmlAttributeAttribute(true)]
        public string FullName
        {
            get
            {
                return this._fullName;
            }
            set
            {
                if ((this._fullName != value))
                {
                    string old = this._fullName;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnFullNameChanging(e);
                    this.OnPropertyChanging("FullName", e, _fullNameAttribute);
                    this._fullName = value;
                    this.OnFullNameChanged(e);
                    this.OnPropertyChanged("FullName", e, _fullNameAttribute);
                }
            }
        }
        
        /// <summary>
        /// The coordX property
        /// </summary>
        [DisplayNameAttribute("coordX")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("coordX")]
        [XmlAttributeAttribute(true)]
        public double CoordX
        {
            get
            {
                return this._coordX;
            }
            set
            {
                if ((this._coordX != value))
                {
                    double old = this._coordX;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnCoordXChanging(e);
                    this.OnPropertyChanging("CoordX", e, _coordXAttribute);
                    this._coordX = value;
                    this.OnCoordXChanged(e);
                    this.OnPropertyChanged("CoordX", e, _coordXAttribute);
                }
            }
        }
        
        /// <summary>
        /// The coordY property
        /// </summary>
        [DisplayNameAttribute("coordY")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("coordY")]
        [XmlAttributeAttribute(true)]
        public double CoordY
        {
            get
            {
                return this._coordY;
            }
            set
            {
                if ((this._coordY != value))
                {
                    double old = this._coordY;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnCoordYChanging(e);
                    this.OnPropertyChanging("CoordY", e, _coordYAttribute);
                    this._coordY = value;
                    this.OnCoordYChanged(e);
                    this.OnPropertyChanged("CoordY", e, _coordYAttribute);
                }
            }
        }
        
        /// <summary>
        /// Gets a value indicating whether the current model element can be identified by an attribute value
        /// </summary>
        public override bool IsIdentified
        {
            get
            {
                return true;
            }
        }
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired before the FullName property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> FullNameChanging;
        
        /// <summary>
        /// Gets fired when the FullName property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> FullNameChanged;
        
        /// <summary>
        /// Gets fired before the CoordX property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CoordXChanging;
        
        /// <summary>
        /// Gets fired when the CoordX property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CoordXChanged;
        
        /// <summary>
        /// Gets fired before the CoordY property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CoordYChanging;
        
        /// <summary>
        /// Gets fired when the CoordY property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CoordYChanged;
        
        private static ITypedElement RetrieveNameAttribute()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Location.ClassInstance)).Resolve("name")));
        }
        
        /// <summary>
        /// Raises the NameChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveFullNameAttribute()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Location.ClassInstance)).Resolve("fullName")));
        }
        
        /// <summary>
        /// Raises the FullNameChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnFullNameChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.FullNameChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the FullNameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnFullNameChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.FullNameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveCoordXAttribute()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Location.ClassInstance)).Resolve("coordX")));
        }
        
        /// <summary>
        /// Raises the CoordXChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCoordXChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CoordXChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the CoordXChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCoordXChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CoordXChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveCoordYAttribute()
        {
            return ((ITypedElement)(((ModelElement)(pruebasConsola.GameCreator.Location.ClassInstance)).Resolve("coordY")));
        }
        
        /// <summary>
        /// Raises the CoordYChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCoordYChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CoordYChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the CoordYChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCoordYChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CoordYChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "NAME"))
            {
                return this.Name;
            }
            if ((attribute == "FULLNAME"))
            {
                return this.FullName;
            }
            if ((attribute == "COORDX"))
            {
                return this.CoordX;
            }
            if ((attribute == "COORDY"))
            {
                return this.CoordY;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "NAME"))
            {
                this.Name = ((string)(value));
                return;
            }
            if ((feature == "FULLNAME"))
            {
                this.FullName = ((string)(value));
                return;
            }
            if ((feature == "COORDX"))
            {
                this.CoordX = ((double)(value));
                return;
            }
            if ((feature == "COORDY"))
            {
                this.CoordY = ((double)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "NAME"))
            {
                return new NameProxy(this);
            }
            if ((attribute == "FULLNAME"))
            {
                return new FullNameProxy(this);
            }
            if ((attribute == "COORDX"))
            {
                return Observable.Box(new CoordXProxy(this));
            }
            if ((attribute == "COORDY"))
            {
                return Observable.Box(new CoordYProxy(this));
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            throw new NotSupportedException();
        }
        
        /// <summary>
        /// Gets the identifier string for this model element
        /// </summary>
        /// <returns>The identifier string</returns>
        public override string ToIdentifierString()
        {
            if ((this.Name == null))
            {
                return null;
            }
            return this.Name.ToString();
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the name property
        /// </summary>
        private sealed class NameProxy : ModelPropertyChange<ILocation, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public NameProxy(ILocation modelElement) : 
                    base(modelElement, "name")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Name;
                }
                set
                {
                    this.ModelElement.Name = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the fullName property
        /// </summary>
        private sealed class FullNameProxy : ModelPropertyChange<ILocation, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public FullNameProxy(ILocation modelElement) : 
                    base(modelElement, "fullName")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.FullName;
                }
                set
                {
                    this.ModelElement.FullName = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the coordX property
        /// </summary>
        private sealed class CoordXProxy : ModelPropertyChange<ILocation, double>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public CoordXProxy(ILocation modelElement) : 
                    base(modelElement, "coordX")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override double Value
            {
                get
                {
                    return this.ModelElement.CoordX;
                }
                set
                {
                    this.ModelElement.CoordX = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the coordY property
        /// </summary>
        private sealed class CoordYProxy : ModelPropertyChange<ILocation, double>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public CoordYProxy(ILocation modelElement) : 
                    base(modelElement, "coordY")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override double Value
            {
                get
                {
                    return this.ModelElement.CoordY;
                }
                set
                {
                    this.ModelElement.CoordY = value;
                }
            }
        }
    }
}

